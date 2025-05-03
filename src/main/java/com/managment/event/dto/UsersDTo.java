package com.managment.event.dto;

public class UsersDTo {
	
	    private Long id;

	    private String name;
	    private String email;
	    private Long eventId;
	    
	    
	    
	    
		public UsersDTo(Long id, String name, String email, Long eventId) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.eventId = eventId;
		}
		
		
		public Long getEventId() {
			return eventId;
		}
		public void setEventId(Long eventId) {
			this.eventId = eventId;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

	    
	    
}
