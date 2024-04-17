//package com.example.EMS.controller;
//
//import com.example.EMS.SignUpRequest;
//import com.example.EMS.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/auth")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/signup")
//    public ResponseEntity<?> registerUser(@RequestBody SignUpRequest signUpRequest) {
//        if (userService.existsByUsername(signUpRequest.getUsername())) {
//            return ResponseEntity
//                    .badRequest()
//                    .body(new MessageResponse("Error: Username is already taken!"));
//        }
//
//        if (userService.existsByEmail(signUpRequest.getEmail())) {
//            return ResponseEntity
//                    .badRequest()
//                    .body(new MessageResponse("Error: Email is already in use!"));
//        }
//
//
//        userService.createUser(signUpRequest);
//
//        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
//    }
//}
//
//
