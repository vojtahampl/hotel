package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    ///region Atributy
    public int bookingId;
    private Guest guest;
    private List<Guest> otherGuests;
    private Room room;
    public LocalDate startDate;
    public LocalDate endDate;
    public Boolean leisure;
    ///endregion

    ///region Konstruktory
    public Booking(int bookingId, Guest guest, Guest otherGuests, Room room, LocalDate startDate, LocalDate endDate, Boolean leisure) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.otherGuests = new ArrayList<>();
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.leisure = leisure;
    }

    ///endregion

    ///region Přístupy
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Guest getGuest() {
        return guest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests() {
        this.otherGuests = otherGuests;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Boolean getLeisure() {
        return leisure;
    }

    public void setLeisure(Boolean leisure) {
        this.leisure = leisure;
    }

    ///endregion
}

