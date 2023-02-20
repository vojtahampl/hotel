package com.engeto.hotel;

public class Room {
    ///Atributy
    public int roomId;
    public int roomNumber;
    public int numberOfBeds;
    public String roomType;
    public Boolean balcony;
    public Boolean seaView;
    public Double pricePerNight;

    ///endregion

    /// Konstruktory

    public Room(int roomId, int roomNumber, int numberOfBeds, String roomType, Boolean balcony, Boolean seaView, Double pricePerNight) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.roomType = roomType;
        this.balcony = balcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }
    ///endregion

    /// Přístupy

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Boolean getBalcony() {
        return balcony;
    }

    public void setBalcony(Boolean balcony) {
        this.balcony = balcony;
    }

    public Boolean getSeaView() {
        return seaView;
    }

    public void setSeaView(Boolean seaView) {
        this.seaView = seaView;
    }

    public Double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(Double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getDescription() {
        return "Číslo pokoje: "+roomNumber+", typ pokoje: "+roomType+", jeho cena je: "+pricePerNight+".";


    ///endregion

}}
