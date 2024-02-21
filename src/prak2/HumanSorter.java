package prak2;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HumanSorter {
    public static void testHumanSorter() {
        List<Human> humans = new ArrayList<>();

        humans.add(new Human(2023 - 1999, "Ivan", "Ivanov", LocalDate.of(1999, 7, 23), 80));
        humans.add(new Human(2023 - 2006, "Maksim", "Ignatev", LocalDate.of(2006, 3, 18), 75));
        humans.add(new Human(2023 - 2004, "Elina", "Leonova", LocalDate.of(2004, 3, 20), 48));
        humans.add(new Human(2023 - 2003, "Leonid", "Frolov", LocalDate.of(2003, 8, 4), 58));
        humans.add(new Human(2023 - 2005, "Dmitry", "Nosov", LocalDate.of(2005, 12, 6), 84));
        humans.add(new Human(2023 - 2008, "Mark", "Glazunov", LocalDate.of(2008, 5, 14), 65));


        humans.forEach(x -> System.out.print(x + " "));
        System.out.println();

        humans.stream().limit(5).forEach(x -> System.out.print(x + " "));
        System.out.println();

        humans.stream().limit(5).sorted(Comparator.comparing(Human::getBirthDate, Collections.reverseOrder())).forEach(x -> System.out.print(x + " "));
        System.out.println();

        humans.stream().limit(5).sorted(Comparator.comparing(Human::getBirthDate, Collections.reverseOrder())).filter(h -> h.getWeight() < 60).forEach(x -> System.out.print(x + " "));
        System.out.println();

        humans.stream().limit(5).sorted(Comparator.comparing(Human::getBirthDate, Collections.reverseOrder())).filter(h -> h.getWeight() < 60).forEach(x -> System.out.println(x.firstName + " " + x.lastName));


    }
}
