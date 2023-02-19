import java.time.LocalDate;

public class Booking {
    ///region Atributy
   public int Id;
    public Guest guest;
    public Room room;
    public LocalDate startDate;
    public LocalDate endDate;
    public Boolean vacationType;
    ///endregion

    ///region Konstruktory

    public Booking(int Id, LocalDate startDate, LocalDate endDate, Boolean vacationType) {
        this.Id = Id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.vacationType = vacationType;
    }

    ///endregion

    ///region Přístupy

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
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

    public Boolean getVacationType() {
        return vacationType;
    }

    public void setVacationType(Boolean vacationType) {
        this.vacationType = vacationType;
    }

    ///endregion
}
