package com.reactcrud.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reactcrud.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
