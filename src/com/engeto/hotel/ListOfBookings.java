package com.engeto.hotel;
import java.util.List;

public class ListOfBookings {
    ///region Atributy
    private List<Booking> bookingList;

    ///endregion

    ///region Konstruktory

    public ListOfBookings(List<Booking> bookingList) {
        this.bookingList = bookingList;

    }

    ///endregion

    ///region Přístupy
    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    ///endregion

    }
