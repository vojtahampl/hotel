package engeto.hotel.Guest;

import java.time.LocalDate;

public class Guest {
    ///region Atributy
    public int Id;
    public String jmeno;
    public String prijmeni;
    public LocalDate datumNarozeni;

    ///endregion

    ///region Konstruktory

    public Guest() {
        setId(++1);
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
    }

    ///endregion

    ///region Pristupy
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    ///endregion
}
