import java.math.BigDecimal;

public class Room {
    ///Atributy
    public int Id;
    public int roomNumber;
    public int numberOfBeds;
    public Boolean balcony;
    public Boolean seaView;
    public BigDecimal pricePerNight;

    ///endregion

    /// Konstruktory

    public Room(int Id, int roomNumber, int numberOfBeds, Boolean balcony, Boolean seaView, BigDecimal pricePerNight) {
        this.Id = Id;
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.balcony = balcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }
    ///endregion

    /// Přístupy

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    ///endregion

}
