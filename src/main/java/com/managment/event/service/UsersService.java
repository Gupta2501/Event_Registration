package com.managment.event.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.managment.event.dto.EventDto;

import com.managment.event.dto.UsersDTo;
import com.managment.event.entity.EventEntity;
import com.managment.event.entity.UsersEntity;
import com.managment.event.repo.EventRepo;
import com.managment.event.repo.UsersRepo;

@Service
public class UsersService {
	
	@Autowired
	UsersRepo regE;
	
	@Autowired
	EventRepo eventRepo;

	public String registerEvent(UsersDTo dto) {
		
		Optional<EventEntity> eventId=eventRepo.findById(dto.getEventId());
		
		if(eventId.isPresent()) {
			EventEntity	event=eventId.get();
			UsersEntity reg=new UsersEntity();
			reg.setEmail(dto.getEmail());
			reg.setName(dto.getName());
			reg.setEvent(event);
			regE.save(reg);
			return "Register Successfully";
			
		}else return "event not found";
	}
	
public List<EventDto> allEvent() {
		
		List<EventEntity> events=eventRepo.findAll();
		List<EventDto> eventdto=new ArrayList<>();
		
		for(EventEntity event:events) {//for(EventEntiy event=0;event<=events;event++)
			EventDto dto=new EventDto();
			dto.setId(event.getId());
			dto.setName(event.getName());
			dto.setDescription(event.getDescription());
			dto.setImageUrl(event.getImageUrl());
			dto.setType(event.getType());
			dto.setDates(event.getDates());
			dto.setLocation(event.getLocation());
			eventdto.add(dto);
			
			
		}
		return eventdto;
	}



public List<EventDto> searchByName(String name) {

	List<EventEntity> eventName=eventRepo.findByNameContainingIgnoreCase(name);
	List<EventDto> allRes=new ArrayList<>();
	for(EventEntity e:eventName) {
		EventDto event=new EventDto();
		event.setName(e.getName());
		event.setType(e.getType());
		event.setImageUrl(e.getImageUrl());
		event.setId(e.getId());
		event.setDescription(e.getDescription());
		event.setDates(e.getDates());
		event.setLocation(e.getLocation());
		allRes.add(event);
		
	}
	
	return allRes;
}

public List<EventDto> findByType(String type) {
	
	List<EventEntity> t=eventRepo.findByTypeContainingIgnoreCase(type);
	List<EventDto> allType=new ArrayList<>();
	for(EventEntity e:t) {
		EventDto eve=new EventDto();
		eve.setId(e.getId());
		eve.setImageUrl(e.getImageUrl());
		eve.setName(e.getName());
		eve.setDescription(e.getDescription());
		eve.setLocation(e.getLocation());
		eve.setDates(e.getDates());
		eve.setType(e.getType());
		allType.add(eve);
	}
	// TODO Auto-generated method stub
	return allType;
}



}
