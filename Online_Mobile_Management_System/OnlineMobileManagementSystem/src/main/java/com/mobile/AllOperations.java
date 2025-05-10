package com.mobile;

import com.mobile.service.MobileService;
import com.mobile.serviceimpl.MobileServiceImpl;
import com.mobile.entity.Mobile;
import com.mobile.exception.ResourceNotFoundException;

import java.util.List;
import java.util.Scanner;

public class AllOperations {

    static MobileService mobileService = new MobileServiceImpl();
    static Scanner sc = new Scanner(System.in);

    // Method to take mobile input from user
    public static Mobile mobileInputs() {
        System.out.println("Enter Mobile ID:");
        int mobileId = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter Mobile Name:");
        String mobileName = sc.nextLine();

        System.out.println("Enter Brand Name:");
        String brand = sc.nextLine();

        System.out.println("Enter Color:");
        String color = sc.nextLine();

        System.out.println("Enter Model Name:");
        String model = sc.nextLine();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();
        sc.nextLine(); // Consume newline

        System.out.println("Enter Specifications:");
        String specifications = sc.nextLine();

        return new Mobile(mobileName, brand, color, model, price, specifications);
    }

    // Mobile Operations
    public static void mobileOperations() {
        while (true) {
            System.out.println("\n========= Online Mobile Management System =========");
            System.out.println("1. Add Mobile");
            System.out.println("2. Retrieve All Mobiles");
            System.out.println("3. Update Mobile");
            System.out.println("4. Delete Mobile");
            System.out.println("5. Go back to Main Menu");
            System.out.print("Enter your choice: ");

            int input = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (input) {
                case 1:
                    Mobile mobile = mobileInputs();
                    Mobile savedEntity = mobileService.createMobile(mobile);
                    System.out.println("Mobile Data saved successfully: " + savedEntity);
                    break;

                case 2:
                    List<Mobile> mobiles = mobileService.getAllMobiles();
                    if (mobiles.isEmpty()) {
                        System.out.println("No mobiles found!");
                    } else {
                        System.out.println("\nAvailable Mobiles:");
                        for (Mobile mob : mobiles) {
                            System.out.println(mob);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter Mobile ID to update:");
                    int mId = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    try {
                        Mobile existingMobile = mobileService.getMobile(mId);
                        if (existingMobile == null) {
                            System.out.println("Error: Mobile ID not found!");
                            break;
                        }

                        Mobile updatedData = updatedMobileData(mId);
                        Mobile updatedInfo = mobileService.updateMobile(mId, updatedData);
                        System.out.println("Mobile Data updated successfully: " + updatedInfo);
                    } catch (Exception e) {
                        System.out.println("Error updating mobile: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Enter Mobile ID to delete:");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.println("Are you sure you want to delete this mobile? (yes/no)");
                    String confirmation = sc.nextLine().toLowerCase();
                    if (confirmation.equals("yes")) {
                        try {
                            String message = mobileService.deleteMobile(id);
                            System.out.println(message);
                        } catch (Exception e) {
                            System.out.println("Error deleting mobile: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Deletion cancelled.");
                    }
                    break;

                case 5:
                    return; // Exit method

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    public static Mobile updatedMobileData(int mobileId) {
        System.out.println("Enter New Mobile Name:");
        String mobileName = sc.nextLine();

        System.out.println("Enter New Brand Name:");
        String brand = sc.nextLine();

        System.out.println("Enter New Color:");
        String color = sc.nextLine();

        System.out.println("Enter New Model Name:");
        String model = sc.nextLine();

        System.out.println("Enter New Price:");
        double price = sc.nextDouble();
        sc.nextLine(); // Consume newline

        System.out.println("Enter New Specifications:");
        String specifications = sc.nextLine();

        return new Mobile(mobileName, brand, color, model, price, specifications);
    }
}
