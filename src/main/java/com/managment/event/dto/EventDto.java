package com.managment.event.dto;

import java.time.LocalDate;



public class EventDto {
	
	    private Long id;

	   
	    private String name;
	 
	    private String type;
	  
	    private String description;
	   
	    private LocalDate dates;
	  
	    private String imageUrl;
	    private String location;
	    
	    

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
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

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public LocalDate getDates() {
			return dates;
		}

		public void setDates(LocalDate dates) {
			this.dates = dates;
		}

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
	    
	    

}
