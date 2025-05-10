package com.mobile.exception;

//This exception is thrown when a requested resource is not found in the database
public class ResourceNotFoundException extends RuntimeException {
 
 public ResourceNotFoundException(String message) {
     super(message);
 }
}
