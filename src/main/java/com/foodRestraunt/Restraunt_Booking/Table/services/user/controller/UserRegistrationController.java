package com.foodRestraunt.Restraunt_Booking.Table.services.user.controller;
import org.springframework.web.bind.annotation.RestController;
import com.foodRestraunt.Restraunt_Booking.Table.services.user.dto.UserRegistrationDto;
import com.foodRestraunt.Restraunt_Booking.Table.services.user.serviceInterFace.UserRegistrationServiceInterface;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/")
public class UserRegistrationController {
//   private static final Logger logger = LoggerFactory.getLogger(UserRegistrationController.class);


    private final UserRegistrationServiceInterface userRegistrationServiceInterface;

    public UserRegistrationController(UserRegistrationServiceInterface userRegistrationServiceInterface) {
    this.userRegistrationServiceInterface = userRegistrationServiceInterface;
    }

    @PostMapping("/userRegister")
    public ResponseEntity<Long> createUser(
    @Valid @RequestBody UserRegistrationDto userRegistrationDto,
        HttpServletResponse response) {
    Cookie cookie = new Cookie("Hello", "COOKIE_VALUE");
    cookie.setHttpOnly(false);
    cookie.setSecure(false); 
    cookie.setPath("http://localhost:5173/");
    cookie.setMaxAge(24 * 60 * 60);
    response.addCookie(cookie);
    return ResponseEntity.ok(userRegistrationServiceInterface.createUser(userRegistrationDto));
}

   @GetMapping("/getUser/{id}")
    public ResponseEntity<UserRegistrationDto> get(@PathVariable Long id) {
        return ResponseEntity.ok(userRegistrationServiceInterface.getUserById(id));
    }

    // @GetMapping("/getUser/{id}")
    // public String get(@PathVariable Long id) {
    //     return "hello";
    //     // return ResponseEntity.ok(userService.getUserById(id));
    // }
    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("Working");
    }
    
}
