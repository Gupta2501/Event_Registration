package com.managment.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.managment.event.dto.EventDto;
import com.managment.event.dto.UsersDTo;
import com.managment.event.service.UsersService;

@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping("/user")
@RestController
public class UsersController {
	
	@Autowired
	UsersService s;
	
	//user Register for event means add there data 
	@PostMapping("/register")//its register specific event that why eventid
	public String registerForEvent( @RequestBody UsersDTo dto){
		
		return s.registerEvent(dto);
		
		
	}

	@GetMapping("/all/event")
	public List<EventDto> getAllEvent(){
		return s.allEvent();
		
	}
	

	@GetMapping("/search")
	public List<EventDto> search(@RequestParam("name") String name){
		return s.searchByName(name);
	}
	@GetMapping("/find/by/type")
	public List<EventDto> findType(@RequestParam("type") String type){
		return s.findByType(type);
	}

}
