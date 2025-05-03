package com.managment.event.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.managment.event.entity.UsersEntity;

@Repository
public interface UsersRepo extends JpaRepository<UsersEntity, Long>{
 
}
