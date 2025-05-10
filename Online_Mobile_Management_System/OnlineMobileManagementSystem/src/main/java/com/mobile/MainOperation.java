package com.mobile;

import java.util.List;
import java.util.Scanner;

import com.mobile.entity.*;
import com.mobile.service.*;
import com.mobile.serviceimpl.*;

public class MainOperation {
public static Scanner sc = new Scanner(System.in);

    private static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static OrderService orderService = new OrderServiceImpl();
    private static AdminService adminService = new AdminServiceImpl();
    private static AddressService addressService = new AddressServiceImpl();
    private static PaymentService paymentService = new PaymentServiceImpl();
    private static UserService userService = new UserServiceImpl();
    private static CartService cartService = new CartServiceImpl();
    private static MobileService mobileService = new MobileServiceImpl();


    public static void mainOps() {
        while (true) {
            System.out.println("\n========= Online Mobile Management System =========");
            System.out.println("Press 1. Mobile Operations");
            System.out.println("Press 2. Customer Operations");
            System.out.println("Press 3. Order Operations");
            System.out.println("Press 4. Admin Operations");
            System.out.println("Press 5. User Operations");
            System.out.println("Press 6. Cart Operations");
            System.out.println("Press 7. Payment Operations");
            System.out.println("Press 8. Exit");
            System.out.print("Enter your choice: ");

            int input = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (input) {
                case 1:
                    AllOperations.mobileOperations();
                    break;
                case 2:
                    customerOperations();
                    break;
                case 3:
                    orderOperations();
                    break;
                case 4:
                    adminOperations();
                    break;
                case 5:
                    userOperations();
                    break;
                case 6:
                    cartOperations();
                    break;
                case 7:
                    paymentOperations();
                    break;
                    
                case 8:
                    System.out.println("Exiting... Thank you for using the Online Mobile Management System!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    private static void customerOperations() {
        while (true) {
            System.out.println("\n======== Customer Operations ========");
            System.out.println("1. Add Customer");
            System.out.println("2. View All Customers");
            System.out.println("3. Update Customer");
            System.out.println("4. Delete Customer");
            System.out.println("5. Go Back");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Customer customer = customerInputs();
                    customerService.createCustomer(customer);
                    System.out.println("Customer added successfully!");
                    break;
                case 2:
                    List<Customer> customers = customerService.getAllCustomers();
                    
                    // Null or empty check before iterating over the list
                    if (customers == null || customers.isEmpty()) {
                        System.out.println("No customers found.");
                    } else {
                        for (Customer c : customers) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter Customer ID to update:");
                    String customerId = sc.nextLine();
                    Customer updatedCustomer = updatedCustomerData();
                    customerService.updateCustomer(customerId, updatedCustomer);
                    System.out.println("Customer updated successfully!");
                    break;
                case 4:
                    System.out.println("Enter Customer ID to delete:");
                    String deleteId = sc.nextLine();
                    customerService.deleteCustomer(deleteId);
                    System.out.println("Customer deleted successfully!");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }


    private static Customer customerInputs() {
        System.out.println("Enter Customer ID:");
        String customerId = sc.nextLine();

        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine();

        System.out.println("Enter Customer Email:");
        String email = sc.nextLine();
        
        System.out.println("Enter Customer Address:");
        String address = sc.nextLine();
        

        Customer customer = new Customer();
        customer.setCustomerId(customerId); // assuming you have a field like this
        customer.setName(customerName);
        customer.setEmail(email);
        return customer;
    }

    private static Customer updatedCustomerData() {
        System.out.println("Enter New Customer Name:");
        String customerName = sc.nextLine();

        System.out.println("Enter New Customer Email:");
        String email = sc.nextLine();
        
        System.out.println("Enter New Customer Address:");
        String address= sc.nextLine();
        
        

        Customer customer = new Customer();
        customer.setName(customerName);
        customer.setEmail(email);
        return customer;
    }

    private static void orderOperations() {
        while (true) {
            System.out.println("\n======== Order Operations ========");
            System.out.println("1. Place Order");
            System.out.println("2. View All Orders");
            System.out.println("3. Cancel Order");
            System.out.println("4. Go Back");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Orders order = placeOrder();
                    orderService.placeOrder(order);
                    System.out.println("Order placed successfully!");
                    break;
                case 2:
                    List<Orders> orders = orderService.getAllOrders();
                    for (Orders o : orders) {
                        System.out.println(o);
                    }
                    break;
                case 3:
                    System.out.println("Enter Order ID to cancel:");
                    String orderId = sc.nextLine();
                    orderService.cancelOrder(orderId);
                    System.out.println("Order canceled successfully!");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static Orders placeOrder() {
        System.out.println("Enter Order ID:");
        String orderId = sc.nextLine();
        System.out.println("Enter Customer ID:");
        String customerId = sc.nextLine();
        System.out.println("Enter Order Date:");
        String orderDate = sc.nextLine();
        return new Orders();
    }

    private static void adminOperations() {
        while (true) {
            System.out.println("\n======== Admin Operations ========");
            System.out.println("1. Add Admin");
            System.out.println("2. View All Admins");
            System.out.println("3. Go Back");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Admin admin = new Admin();
                    System.out.println("Enter Admin ID:");
                    admin.setAdminId(sc.nextLine());
                    System.out.println("Enter Name:");
                    admin.setName(sc.nextLine());
                    System.out.println("Enter Email:");
                    admin.setEmail(sc.nextLine());
                    System.out.println("Enter Password:");
                    admin.setPassword(sc.nextLine());
                    adminService.createAdmin(admin);
                    System.out.println("Admin added successfully!");
                    break;
                case 2:
                    List<Admin> admins = adminService.getAllAdmins();
                    for (Admin a : admins) {
                        System.out.println(a);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
    
    
    private static void userOperations() {
        while (true) {
            System.out.println("\n======== User Operations ========");
            System.out.println("1. Add User");
            System.out.println("2. View All Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Go Back");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    User newUser = inputUserDetails();
                    userService.createUser(newUser);
                    System.out.println("✅ User added successfully!");
                    break;
                case 2:
                    List<User> users = userService.getAllUsers();
                    for (User u : users) {
                        System.out.println(u);
                    }
                    break;
                case 3:
                    System.out.print("Enter User ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    User updatedUser = inputUserDetails();
                    userService.updateUser(updateId, updatedUser);
                    System.out.println("✅ User updated successfully!");
                    break;
                case 4:
                    System.out.print("Enter User ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    userService.deleteUser(deleteId);
                    System.out.println("✅ User deleted successfully!");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static User inputUserDetails() {
        User user = new User();

        System.out.print("Enter Name: ");
        user.setName(sc.nextLine());

        System.out.print("Enter Email: ");
        user.setEmail(sc.nextLine());

        System.out.print("Enter Password: ");
        user.setPassword(sc.nextLine());

        Address address = new Address();
        System.out.print("Enter Street: ");
        address.setStreet(sc.nextLine());
        
        System.out.print("Enter City: ");
        address.setCity(sc.nextLine());
        
        System.out.print("Enter State: ");
        address.setState(sc.nextLine());
        
        System.out.print("Enter Country: ");
        address.setCountry(sc.nextLine());
        
        System.out.print("Enter Pincode: ");
        address.setPincode(sc.nextLine());

        user.setAddress(address);
        return user;
    }
    
    private static void cartOperations() {
        while (true) {
            System.out.println("\n======== Cart Operations ========");
            System.out.println("1. Add to Cart");
            System.out.println("2. View All Cart Items");
            System.out.println("3. Remove Item from Cart");
            System.out.println("4. Go Back");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Customer ID:");
                    String customerId = sc.nextLine();
                    System.out.println("Enter Mobile ID:");
                    int mobileId = sc.nextInt();
                    System.out.println("Enter Quantity:");
                    int qty = sc.nextInt();
                    sc.nextLine();

                    Cart newCart = cartService.addToCart(customerId, mobileId, qty);
                    System.out.println("Item added to cart: " + newCart);
                    break;

                case 2:
                    List<Cart> cartItems = cartService.getAllCartItems();
                    for (Cart c : cartItems) {
                        System.out.println(c);
                    }
                    break;

                case 3:
                    System.out.println("Enter Cart ID to remove:");
                    int cartId = sc.nextInt();
                    sc.nextLine();
                    cartService.removeFromCart(cartId);
                    System.out.println("Item removed from cart!");
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
    
    private static void paymentOperations() {
        while (true) {
            System.out.println("\n======== Payment Operations ========");
            System.out.println("1. Make Payment");
            System.out.println("2. View All Payments");
            System.out.println("3. Go Back");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Order ID:");
                    String orderId = sc.nextLine();

                    System.out.println("Enter Payment Method (e.g., Credit Card, UPI, COD):");
                    String paymentMethod = sc.nextLine();

                    System.out.println("Enter Amount:");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    Payment payment = paymentService.makePayment(orderId, paymentMethod, amount);
                    System.out.println("Payment successful: " + payment);
                    break;

                case 2:
                    List<Payment> payments = paymentService.getAllPayments();
                    for (Payment p : payments) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
    public static void main(String[] args) {
        mainOps();
    }
} 