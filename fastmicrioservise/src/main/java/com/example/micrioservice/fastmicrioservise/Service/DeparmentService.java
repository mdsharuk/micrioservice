package com.example.micrioservice.fastmicrioservise.Service;

import com.example.micrioservice.fastmicrioservise.Entity.Deparment;
import com.example.micrioservice.fastmicrioservise.Repo.DeparmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DeparmentService {
    @Autowired
    private DeparmentRepo deparmentRepo;

    public Deparment savedeparment(Deparment deparment) {
        log.info("inside savedeparment method of DeparmentService");
        return deparmentRepo.save(deparment);
    }


    public Deparment findByDeparmentId(Long deparmentId) {
        return deparmentRepo.findByDeparmentId(deparmentId);
    }
}
