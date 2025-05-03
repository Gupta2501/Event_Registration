package com.managment.event.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.managment.event.dto.AdminDTO;
import com.managment.event.dto.EventDto;
import com.managment.event.dto.UsersDTo;
import com.managment.event.entity.EventEntity;
import com.managment.event.entity.UsersEntity;
import com.managment.event.repo.EventRepo;
import com.managment.event.repo.UsersRepo;

@Service
public class AdminService {
	
	@Autowired
	EventRepo r;
	
	@Autowired
	UsersRepo userR;
	
	
	public String login(AdminDTO dto) {
		
		if("Admin".equals(dto.getUsername()) && "Admin@2211".equals(dto.getPassword()))
		{
			return "login Successfully ";
		}
		else {
			return "Invaild Admin UserName or Password";
		}
		
	}

	public String addEventData(EventDto e) {
		
		
		EventEntity event=new EventEntity();
		
		event.setName(e.getName());
		event.setDescription(e.getDescription());
		event.setDates(e.getDates());
		event.setImageUrl(e.getImageUrl());
		event.setType(e.getType());
		event.setLocation(e.getLocation());
		r.save(event);
		
		return "Add Event";
	}

	
	public String deleteEvent(Long id) {
		Optional<EventEntity> eventId=r.findById(id);
		if(eventId.isPresent()) {
			 r.deleteById(id);
			 return "Event Deleted";
			
		}
	      
		return "Id not found";
	}

	public List<UsersDTo> getAlluser() {
		List<UsersEntity> user=userR.findAll();
		
		List<UsersDTo> dtoAll=new ArrayList<>();
		for(UsersEntity e:user) {//for(UsersEntity e;e<=user)
			
			UsersDTo usersDTo=new UsersDTo(e.getId(), e.getName(), e.getEmail(),
					e.getEvent() != null ? e.getEvent().getId() : null);
			
			dtoAll.add(usersDTo);
			
			
		}
		
		
		return dtoAll;
	}

}
