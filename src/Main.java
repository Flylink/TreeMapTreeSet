import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ольга", "Лос Анхелес Дюран", 27));
        people.add(new Person("Алексей", "Голенищев Кутузов Смоленский", 56));
        people.add(new Person("Александр", "Спартан Пьяный", 22));
        people.add(new Person("Илья", "Гнилой", 18));

        System.out.println(people);

        Collections.sort(people, new PersonsNameLengthComparator(3));
        for (Person p : people) {
            System.out.println(p.getSurname() + " " + p.getAge() + " лет");
        }
    }
}