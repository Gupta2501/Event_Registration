package com.managment.event.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "EVENTS")
public class EventEntity {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "ID")
	    private Long id;

	    @Column(name = "NAME")
	    private String name;
	    @Column(name = "TYPE")
	    private String type;
	    @Column(name = "DESCRIPTION")
	    private String description;
	    @Column(name = "DATES")
	    private LocalDate dates;
	    @Column(name = "IMAGE_URL")
	    private String imageUrl;
	    
	    @Column(name = "LOCATION")
	    private String location;

	    

	    public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
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

		// Optional: To show all registrations under this event
	    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
	    private List<UsersEntity> registrations;

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



		public List<UsersEntity> getRegistrations() {
			return registrations;
		}

		public void setRegistrations(List<UsersEntity> registrations) {
			this.registrations = registrations;
		}

	    
	    
	    
}
