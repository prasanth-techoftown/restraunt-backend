package com.foodRestraunt.Restraunt_Booking.Table.services.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodRestraunt.Restraunt_Booking.Table.services.user.model.UserRegistrationModel;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserRegistrationModel,Long>{
    
}
