package com.drawyourcom.springbootwithsecurityauth.repository;


import com.drawyourcom.springbootwithsecurityauth.model.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBUserRepository extends JpaRepository<DBUser, Integer> {
    DBUser findByUsername(String username);
}