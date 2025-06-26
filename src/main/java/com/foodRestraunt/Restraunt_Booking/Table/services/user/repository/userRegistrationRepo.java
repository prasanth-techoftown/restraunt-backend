package com.foodRestraunt.Restraunt_Booking.Table.services.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodRestraunt.Restraunt_Booking.Table.services.primaryId.PrimaryId;

@Repository
public interface userRegistrationRepo extends JpaRepository<PrimaryId,Long>{
    
}
