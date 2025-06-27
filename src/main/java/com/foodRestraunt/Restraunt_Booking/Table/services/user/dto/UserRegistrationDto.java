package com.foodRestraunt.Restraunt_Booking.Table.services.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserRegistrationDto {

    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name must not exceed 100 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 100, message = "Password must be between 8 and 100 characters")
    private String password;

    @NotBlank(message = "Mobile number is required")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid Indian mobile number")
    private String mobileNumber;

    @NotBlank(message = "Location is required")
    @Size(max = 100, message = "Location must not exceed 100 characters")
    private String location;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "City is required")
    private String city;

    private UserRegistrationDto(UserRegistrationBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
        this.mobileNumber = builder.mobileNumber;
        this.location = builder.location;
        this.state = builder.state;
        this.city = builder.city;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getLocation() {
        return location;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
public UserRegistrationDto() {
    
}
  
    public static class UserRegistrationBuilder {
        private String name;
        private String email;
        private String password;
        private String mobileNumber;
        private String location;
        private String state;
        private String city;

        public UserRegistrationBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserRegistrationBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserRegistrationBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserRegistrationBuilder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public UserRegistrationBuilder setLocation(String location) {
            this.location = location;
            return this;
        }

        public UserRegistrationBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public UserRegistrationBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public UserRegistrationDto build() {
            return new UserRegistrationDto(this);
        }
    }
}
