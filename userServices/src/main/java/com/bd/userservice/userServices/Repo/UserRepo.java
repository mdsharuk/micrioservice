package com.bd.userservice.userServices.Repo;

import com.bd.userservice.userServices.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long > {
    User findByUserId(Long userId);
}
