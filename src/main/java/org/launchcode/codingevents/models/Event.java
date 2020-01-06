package org.launchcode.codingevents.models;

import javax.validation.constraints.*;
import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3-50 characters.")
    private String name;

    @Size(max = 500, message = "Description is too long!")
    private String description;

    @NotNull(message = "Please put a real location.")
    @NotBlank(message = "Location is required.")
    private String location;

    @Size(min = 1, message = "You must have at least 1 attendee.")
    private String numberAttendees;

    @AssertTrue
    private Boolean mustRegister;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email. Try again")
    private String contactEmail;

    public Event(String name, String description, String contactEmail, String location, String numberAttendees, Boolean mustRegister) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.numberAttendees = numberAttendees;
        this.mustRegister = mustRegister;
        this.contactEmail = contactEmail;
        this.id = nextId;
        nextId++;
    }

    public Event(){
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNumberAttendees() {
        return numberAttendees;
    }

    public void setNumberAttendees(String numberAttendees) {
        this.numberAttendees = numberAttendees;
    }

    public Boolean getMustRegister() {
        return mustRegister;
    }

    public void setMustRegister(Boolean mustRegister) {
        this.mustRegister = mustRegister;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
