public class Ukol
{
    // Potřebujeme evidovat hosty (guest), které ubytováváme v hotelu.
    //
    //O každém hostu musíme uložit jméno, příjmení a datum narození.
    //
    //Hosty vždy ubytováváme na pokojích (room). Pokoj je identifikován svým číslem.
    // O každém pokoji chceme evidovat, kolik lůžek tam je (neřeš přistýlky apod.),
    // zda má pokoj balkón a zda má výhled na moře a jaká je cena pokoje za jednu noc (předpokládej, že je cena pevně daná bez ohledu na sezónu a počet ubytovaných).
    //
    //V rámci jedné rezervace (booking) vždy přiřazujeme pokoj jednomu nebo více hostům na časové období mezi dvěma daty
    // (například pokoj číslo 3 na období od 15. 7. do 24. 7. 2021). Pobyt je buď pracovní, nebo rekreační (type of vacation).
    //
    //Chceme také mít k dispozici třídu, která bude uchovávat všechny rezervace (například list of bookings),
    // které jsme v systému vytvořili a bude mít metodu, která vypíše informace o všech rezervacích.
    //
    //Úkol
    //Tvým úkolem je:
    //
    //Připravit třídy pro ukládání dat.
    //Vytvořit konstruktory a přístupové metody.
    //Poté vytvoř vzorovou testovací aplikaci v metodě main.
    //TESTOVACÍ APLIKACE
    //Vytvoř kód metody main
    //Vytvoř hosty Adélu Malíkovou (narozena 13. 3. 1993) a Jana Dvořáčka (narozen 5.5.1995). Vypiš na obrazovku jejich popis (description).
    //Vytvoř pokoje a vypiš na obrazovku jejich popis:
    //pokoj číslo 1 a pokoj číslo 2 jsou jednolůžkové za cenu 1000 Kč/noc, s balkonem a výhledem na moře.
    //pokoj číslo 3 je trojlůžkový za cenu 2400 Kč/noc, bez balkónu, s výhledem na moře.
    //Připrav rezervace:
    //pro Adélu na pokoj č. 1 od 19. do 26. 7. 2021.
    //pro oba (společná rezervace) na pokoj č. 3 od 1. do 14. 9. 2021.
    //Vypiš seznam všech rezervací.
}
