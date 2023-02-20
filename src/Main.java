import com.engeto.hotel.Booking;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Guest jedna, dva;
        jedna = new Guest(1, "Adéla", "Malíková", LocalDate.of(1993,3,3));
        dva = new Guest(2, "Jan", "Dvořáček", LocalDate.of(1995,5,5));
        System.out.println("Našimi hosty jsou "+ jedna.getJmeno()+" "+ jedna.getPrijmeni()+" a "+dva.getJmeno()+ " "+dva.getPrijmeni()+ ".");
        System.out.println("Adéla se narodila "+ jedna.datumNarozeni+" a Jan se narodil "+dva.datumNarozeni+".");

        Room pokojJedna, pokojDva, pokojTri;
        pokojJedna = new Room(1, 1, 1, "Jednolůžko", Boolean.TRUE, Boolean.TRUE, 1000.0);
        pokojDva = new Room(2, 2, 1, "Jednolůžko", Boolean.TRUE, Boolean.TRUE, 1000.0);
        pokojTri = new Room(3, 3, 3, "Trojlůžko", Boolean.FALSE, Boolean.TRUE, 2400.0);
        System.out.println("Máme dostupné tyto pokoje: "+pokojJedna.roomType+", "+pokojDva.roomType+", "+pokojTri.roomType+".");
        System.out.println("Cena za jednolůžko je: "+pokojJedna.pricePerNight+" a cena za trojlůžko je: "+pokojTri.pricePerNight);

        Booking prvni, druhy;
        prvni = new Booking(1, jedna, null, pokojJedna, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), Boolean.FALSE);
        druhy = new Booking(2, dva, jedna, pokojTri, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), Boolean.TRUE);
        System.out.println("První rezervace začíná: "+prvni.getStartDate()+" a druhá rezervace začíná: "+druhy.getStartDate());
        System.out.println("První rezervaci si udělal/a: "+prvni.getGuest().getJmeno()+" "+ prvni.getGuest().getPrijmeni()+" a druhou rezervace si udělal/a: "+druhy.getGuest().getJmeno()+" "+ druhy.getGuest().getPrijmeni());
        System.out.println("První rezervace je na pokoji typu: "+prvni.getRoom().getRoomType()+" a druhá rezervace je na pokoji typu: "+druhy.getRoom().getRoomType());
        System.out.println("První rezervace stojí na noc: "+prvni.getRoom().getPricePerNight()+",- Kč"+" a druhá rezervace stojí na noc: "+druhy.getRoom().getPricePerNight()+",- Kč");


        List<Booking> bookingList;
        bookingList = new ArrayList<>() {
        };
        {
            bookingList.add(new Booking(1, jedna, null, pokojJedna, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), Boolean.FALSE));
            bookingList.add(new Booking(2, jedna, dva, pokojTri, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), Boolean.TRUE));
        }
        for (Booking ListOfBookings : bookingList)

            System.out.println("Den startu rezervace je: " + ListOfBookings.getStartDate()+" Den konce rezervace je: " + ListOfBookings.getEndDate()
                    +" Rezervace je na udělána na hosta: " + ListOfBookings.getGuest().getDescription()+" Rezervovaný pokoj je: " + ListOfBookings.getRoom().getDescription());

    }
    }