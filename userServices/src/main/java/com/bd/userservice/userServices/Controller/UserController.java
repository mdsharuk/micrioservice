package com.bd.userservice.userServices.Controller;

import com.bd.userservice.userServices.Entity.User;
import com.bd.userservice.userServices.Service.UserService;
import com.bd.userservice.userServices.VO.ResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

   @Autowired
    private UserService userService;

@PostMapping("/")
  public User saveUser(@RequestBody User user){
    log.info("inside saveUser of UserController");
      return userService.saveUser(user);
  }
  @GetMapping("/{id}")
  public ResponseTemplateVo getUserWithDeparment(@PathVariable Long userId){
      log.info("inside getUserWithDeparment of UserController");
      return userService.getUserWithDeparment(userId);

  }



}
