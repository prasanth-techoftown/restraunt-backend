package com.foodRestraunt.Restraunt_Booking.Table.services.user.serviceInterFace;

import com.foodRestraunt.Restraunt_Booking.Table.services.user.dto.UserRegistrationDto;

public interface UserRegistrationServiceInterface {


     Long createUser(UserRegistrationDto userRegistrationDto);
     UserRegistrationDto getUserById(Long getUserById);
    
}
