package com.venueapp.model;

import java.time.LocalDateTime;

public class Booking {
    private String bookingId;
    private String userId;
    private String venueId;
    private LocalDateTime bookingDateTime;
    private int duration; // duration in hours
    private String status; // e.g., "Confirmed", "Cancelled"

    // Constructor
    public Booking(String bookingId, String userId, String venueId, LocalDateTime bookingDateTime, int duration) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.venueId = venueId;
        this.bookingDateTime = bookingDateTime;
        this.duration = duration;
        this.status = "Pending"; // Default status
    }

    // Getters and Setters
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public LocalDateTime getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(LocalDateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void confirmBooking() {
        this.status = "Confirmed";
    }

    public void cancelBooking() {
        this.status = "Cancelled";
    }

    public void rescheduleBooking(LocalDateTime newDateTime) {
        this.bookingDateTime = newDateTime;
        this.status = "Rescheduled";
    }
    
    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", userId='" + userId + '\'' +
                ", venueId='" + venueId + '\'' +
                ", bookingDateTime=" + bookingDateTime +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                '}';
    }
}