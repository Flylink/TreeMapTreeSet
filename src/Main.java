import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ольга", "Лос Анхелес Дюран", 27));
        people.add(new Person("Алексей", "Голенищев Кутузов Смоленский", 56));
        people.add(new Person("Александр", "Спартан Пьяный", 22));
        people.add(new Person("Илья", "Гнилой", 18));

        System.out.println(people);

        Comparator<Person> comparator = (o1, o2) -> {
            String[] s1 = o1.getSurname().split(" ");
            String[] s2 = o2.getSurname().split(" ");
            int maxSurname = 3;
            if (s1.length == s2.length) {
                return Integer.compare(o2.getAge(), o1.getAge());
            } else if (maxSurname <= s1.length && maxSurname <= s2.length) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
            return Integer.compare(s2.length, s1.length);
        };

        Collections.sort(people, comparator);
        for (Person p : people) {
            System.out.println(p.getSurname() + " " + p.getAge() + " лет");
        }
    }
}