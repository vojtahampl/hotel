package com.engeto.hotel;
import java.util.List;

public class ListOfBookings {
    ///region Atributy
    private List<Booking> bookings;

    ///endregion

    ///region Konstruktory

    public ListOfBookings(List<Booking> bookingList) {
        this.bookings = bookingList;

    }

    ///endregion

    ///region Přístupy
    public List<Booking> getBookingList() {
        return bookings;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookings = bookingList;
    }

    ///endregion

    }
