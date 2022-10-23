package com.bd.userservice.userServices.Service;

import com.bd.userservice.userServices.Entity.User;
import com.bd.userservice.userServices.Repo.UserRepo;
import com.bd.userservice.userServices.VO.Deparment;
import com.bd.userservice.userServices.VO.ResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RestTemplate responseTemplate;


    public User saveUser(User user) {
        log.info("inside saveUser of UserService");
        return userRepo.save(user);
    }

    public ResponseTemplateVo getUserWithDeparment(Long userId) {
        log.info("inside getUserWithDeparment of UserService");
        ResponseTemplateVo vo=new ResponseTemplateVo();
        User user=userRepo.findByUserId(userId);
        Deparment deparment=
                responseTemplate.getForObject("http://localhost:9001/deparments/"
                                +user.getDeparmentId(),
                        Deparment.class);
        vo.setUser(user);
        vo.setDeparment(deparment);
        return vo;
    }
}
