package com.example.micrioservice.fastmicrioservise.Repo;

import com.example.micrioservice.fastmicrioservise.Entity.Deparment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeparmentRepo extends JpaRepository<Deparment,Long> {
    Deparment findByDeparmentId(Long deparmentId);
}
