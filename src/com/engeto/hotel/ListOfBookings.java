package com.engeto.hotel;


import java.util.List;

public class ListOfBookings {
    ///region Atributy
    private List<Booking> bookingList;
    private Guest guest;
    private Room room;

    ///endregion

    ///region Konstruktory

    public ListOfBookings(List<Booking> bookingList, Room room, Guest guest) {
        this.bookingList = bookingList;
        this.room = room;
        this.guest = guest;
    }

    ///endregion

    ///region Přístupy

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    ///endregion

    }
