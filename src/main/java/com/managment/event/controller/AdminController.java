package com.managment.event.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.managment.event.dto.AdminDTO;
import com.managment.event.dto.EventDto;
import com.managment.event.dto.UsersDTo;
import com.managment.event.service.AdminService;
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:5173/")
@RestController
public class AdminController {
	
	
	@Autowired
	AdminService s;
	
	
	@PostMapping("/login")
	public String loginAdmin(@RequestBody AdminDTO dto) {
		return s.login(dto);
	}
	
	
	@PostMapping("/add/event")
	public String addEvent(@RequestBody EventDto e) {
		return s.addEventData(e);
	}
	
	
	
	//delete event by admin
	@DeleteMapping("/delete/event/{id}")
	public String del(@PathVariable Long id) {
		return s.deleteEvent(id);
	}
	
	
	//Admin can see which one user reg for which event
	@GetMapping("/reg/users")
	public List<UsersDTo> alluser(){
		return s.getAlluser();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
