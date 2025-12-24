package com.mybus.busManagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class BookingRequestDTO {
    
    @NotNull(message = "Bus ID is required")
    private Long busId;
    
    @NotBlank(message = "Passenger name is required")
    private String passengerName;
    
    @NotBlank(message = "Passenger email is required")
    @Email(message = "Invalid email format")
    private String passengerEmail;
    
    @NotBlank(message = "Passenger phone is required")
    private String passengerPhone;
    
    @NotNull(message = "Number of seats is required")
    @Positive(message = "Number of seats must be positive")
    private Integer numberOfSeats;
    
    // Default constructor
    public BookingRequestDTO() {
    }
    
    // Constructor with parameters
    public BookingRequestDTO(Long busId, String passengerName, String passengerEmail, 
                            String passengerPhone, Integer numberOfSeats) {
        this.busId = busId;
        this.passengerName = passengerName;
        this.passengerEmail = passengerEmail;
        this.passengerPhone = passengerPhone;
        this.numberOfSeats = numberOfSeats;
    }
    
    // Getters and Setters
    public Long getBusId() {
        return busId;
    }
    
    public void setBusId(Long busId) {
        this.busId = busId;
    }
    
    public String getPassengerName() {
        return passengerName;
    }
    
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    
    public String getPassengerEmail() {
        return passengerEmail;
    }
    
    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }
    
    public String getPassengerPhone() {
        return passengerPhone;
    }
    
    public void setPassengerPhone(String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }
    
    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }
    
    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}

