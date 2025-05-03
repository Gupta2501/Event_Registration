package com.managment.event.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.managment.event.entity.EventEntity;

@Repository
public interface EventRepo extends JpaRepository<EventEntity, Long>{

	

	List<EventEntity> findByNameContainingIgnoreCase(String name);
	List<EventEntity> findByTypeContainingIgnoreCase(String type);

}
