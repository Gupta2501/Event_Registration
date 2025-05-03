package com.managment.event.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "REGISTRATIONS")
public class UsersEntity {
	
         @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

         @Column(name = "NAME")
	    private String name;
         @Column(name = "EMAIL")
	    private String email;

	    @ManyToOne
	    @JoinColumn(name = "EVENT_ID") // This will create the event_id column in DB
	    private EventEntity event;

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

		public EventEntity getEvent() {
			return event;
		}

		public void setEvent(EventEntity event) {
			this.event = event;
		}
	    
	    
	    

}
