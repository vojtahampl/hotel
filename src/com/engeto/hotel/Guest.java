package com.engeto.hotel;

import java.time.LocalDate;

public class Guest {
    ///region Atributy
    public int guestId;
    public String jmeno;
    public String prijmeni;
    public LocalDate datumNarozeni;

    ///endregion

    ///region Konstruktory

    public Guest(int guestId, String jmeno, String prijmeni, LocalDate datumNarozeni) {
        this.guestId = guestId;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
    }

    ///endregion

    ///region Pristupy
    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
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

    public String getDescription() {
        return jmeno+" "+prijmeni+ " "+datumNarozeni+".";
    }
    ///endregion
}
