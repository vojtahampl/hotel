import com.engeto.hotel.Booking;
import com.engeto.hotel.Guest;
import com.engeto.hotel.ListOfBookings;
import com.engeto.hotel.Room;

import java.time.LocalDate;


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

//        ArrayList<Booking> listOfBookings= new ArrayList<>();
//      {
//        listOfBookings.add(new Booking(1, jedna, null, pokojJedna, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), Boolean.FALSE));
//      listOfBookings.add(new Booking(2, jedna, dva, pokojTri, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), Boolean.TRUE));
//        }
//        for (int i = 0; i < listOfBookings.size(); i++) {
//            Booking listOfBookings = listOfBookings.get(i);
//            System.out.println("Den startu rezervace je: " + listOfBookings.getStartDate());
//            System.out.println("Den konce rezervace je: " + listOfBookings.getEndDate());
//            System.out.println("Rezervace je na udělána na hosta: " + listOfBookings.getGuest());
//            System.out.println("Rezervovaný pokoj je: " + listOfBookings.getRoom());

        Booking prvni, druhy;
        prvni = new Booking(1, jedna, null, pokojJedna, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), Boolean.FALSE);
        druhy = new Booking(2, jedna, dva, pokojTri, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), Boolean.TRUE);
        System.out.println("První rezervace začíná: "+prvni.getStartDate()+" a druhá rezervace začíná: "+druhy.getStartDate());
        System.out.println("První rezervaci si udělal/a: "+prvni.getGuest()+" a druhou rezervace si udělal/a: "+druhy.getGuest());
        System.out.println("První rezervace je na pokoji typu: "+prvni.getRoom()+" a druhá rezervace je na pokoji typu: "+druhy.getRoom());
        System.out.println("První rezervace stojí na noc: "+prvni.getRoom()+",- Kč"+" a druhá rezervace stojí na noc: "+druhy.getRoom()+",- Kč");

//      System.out.println(Booking.getListOfBookings);

    }
    }