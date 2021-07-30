package com.cognizantmfpe.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizantmfpe.authservice.model.MyUser;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, String> {

	
}
