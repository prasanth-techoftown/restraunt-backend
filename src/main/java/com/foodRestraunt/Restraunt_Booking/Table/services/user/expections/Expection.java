package com.foodRestraunt.Restraunt_Booking.Table.services.user.expections;

public class Expection extends RuntimeException {
     public void ResourceNotFoundException(String resource, String field, Object value) {
        // super(String.format("%s not found with %s : '%s'", resource, field, value));
    }

}
