package com.example.micrioservice.fastmicrioservise.Controller;

import com.example.micrioservice.fastmicrioservise.Entity.Deparment;
import com.example.micrioservice.fastmicrioservise.Service.DeparmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deparments")
@Slf4j
public class DeparmentController {
    @Autowired
    private DeparmentService deparmentService;

    @PostMapping("/")
    public Deparment savedeparment(@RequestBody Deparment deparment){
        log.info("inside savedeparment  method of DeparmentController");
        return deparmentService.savedeparment(deparment);
    }
    @GetMapping("/{id}")
    public Deparment findByDeparmentId(@PathVariable("id") Long deparmentId){
        log.info("inside findByDeparmentId method of DeparmentController");
        return deparmentService.findByDeparmentId( deparmentId);
    }
}
