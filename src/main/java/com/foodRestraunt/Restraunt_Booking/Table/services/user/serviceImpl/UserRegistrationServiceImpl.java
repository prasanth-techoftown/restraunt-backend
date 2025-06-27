package com.foodRestraunt.Restraunt_Booking.Table.services.user.serviceImpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.foodRestraunt.Restraunt_Booking.Table.services.user.dto.UserRegistrationDto;
import com.foodRestraunt.Restraunt_Booking.Table.services.user.model.UserRegistrationModel;
import com.foodRestraunt.Restraunt_Booking.Table.services.user.repository.UserRegistrationRepo;
import com.foodRestraunt.Restraunt_Booking.Table.services.user.serviceInterFace.UserRegistrationServiceInterface;

import jakarta.transaction.Transactional;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationServiceInterface {

private static final Logger logger = LoggerFactory.getLogger(UserRegistrationServiceImpl.class);


private final UserRegistrationRepo userRegistrationRepo;

public UserRegistrationServiceImpl(UserRegistrationRepo userRegistrationRepo){
    this.userRegistrationRepo =userRegistrationRepo;
}


@Override
    public Long createUser(UserRegistrationDto userRegistrationDto) {
        logger.info("Creating user with email: {}", userRegistrationDto.getEmail());
        UserRegistrationModel user = mapToEntity(userRegistrationDto);
        user = userRegistrationRepo.save(user);
        System.out.println( user.getId());
        return user.getId();
        // return mapToDTO(user);
    }

    @Transactional
    @Override
    public UserRegistrationDto getUserById(Long getUserById) {
        logger.info("Fetching user by ID: {}", getUserById);
        UserRegistrationModel user = userRegistrationRepo.findById(getUserById)
            .orElseThrow(() -> new RuntimeException("User not found with ID: " + getUserById));
        return mapToDTO(user);
    }

    private UserRegistrationDto mapToDTO(UserRegistrationModel entity) {
         return new UserRegistrationDto.UserRegistrationBuilder()
        .setName(entity.getName())
        .setEmail(entity.getEmail())
        .setMobileNumber(entity.getMobileNumber())
        .setLocation(entity.getLocation())
        .setState(entity.getState())
        .setCity(entity.getCity())
        .build();
}

  private UserRegistrationModel mapToEntity(UserRegistrationDto dto) {
    UserRegistrationModel entity = new UserRegistrationModel();
    entity.setName(dto.getName());
    entity.setEmail(dto.getEmail());
    entity.setPassword(dto.getPassword());
    entity.setMobileNumber(dto.getMobileNumber());
    entity.setLocation(dto.getLocation());
    entity.setState(dto.getState());
    entity.setCity(dto.getCity());
    return entity;
}



    
}
