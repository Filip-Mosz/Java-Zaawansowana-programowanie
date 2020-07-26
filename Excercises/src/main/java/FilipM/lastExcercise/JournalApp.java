package FilipM.lastExcercise;


import java.time.LocalDate;

public class JournalApp {
    public static void main(String[] args) {
        PersonalJournal myJournal = new PersonalJournal();
        myJournal.addEntry(LocalDate.of(2020,7,20), "Był poniedziałek");
        myJournal.addEntry(LocalDate.of(2020,7,25), "Była sobota");
        myJournal.addEntry(LocalDate.of(2020,7,25), "Pamiętam, jakby to było wczoraj");
        myJournal.addEntry(LocalDate.of(2020,7,28), "Był wtorek");



        System.out.println(myJournal);

        myJournal.readClosestEntries(LocalDate.of(2020,7,25));
    }
}
