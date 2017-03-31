package CollectionsStream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by dwy on 2015/10/28.
 */
public class Person {
    public String firstName;
    public int age;

    public Person(String f, int a) {
        firstName = f;
        age = a;
    }

    public String toString() {
        return "[Person: firstName:" + firstName + " " +
                "age:" + age + "]";
    }

    public String newToString() {
        String s = "new [Person: firstName:" + firstName + " " +
                "age:" + age + "]";
        System.out.println(s);
        return s;
    }

    public static void setNewPeople(int i) {
        newPeople.add(new Person("150", 150 + i));
    }

    public int ageDifference(final Person other) {
        return age - other.age;
    }

    static List<Person> newPeople = Arrays.asList(
            new Person("John", 120),
            new Person("Sara", 21),
            new Person("Jane", 21),
            new Person("Greg", 35));

    public static int count;


    public static void main(String... args) {

        List<Person> collect = newPeople.stream().sorted((person1, person2) -> person1.ageDifference(person2)).collect(Collectors.toList());
        newPeople.stream().sorted(Person::ageDifference).forEach((s) -> System.out.println("args = [" + s.toString() + "]"));
        newPeople.stream().filter(s -> s.age < 30).forEach(Person::newToString);
        List<Person> persons1 = newPeople.stream().sorted(Person::ageDifference).collect(Collectors.toList());
        persons1.forEach(p1 -> System.out.println("p1 = [" + p1.firstName + "  " + p1.age + "]"));
        newPeople.stream().forEach(p -> System.out.println("init" + p.firstName + " " + p.age));


        int sum = newPeople.stream()
                .filter(s -> s.age == 1)
                .mapToInt(s -> s.age)
                .sum();
        newPeople.stream()
                .filter(s -> s.age == 2)
                .findFirst();
        newPeople.stream()
                .filter(s -> s.age == 2)
                .anyMatch(s -> s.age == 2);

        Predicate predic = (s) -> {
            int i = 1 + 2;
            int j = i + 0;
            return i == j && s.equals(i + j);
        };
        newPeople.stream()
                .allMatch(predic.negate());

        newPeople.parallelStream()
                .filter(s -> s.age == 1)
                .mapToInt(s -> s.age)
                .sum();

        newPeople.stream()
                .parallel().findFirst();




        newPeople.stream().forEach((e) -> System.out.println("one" + e.firstName + " " + e.age));

        newPeople.stream().filter((e) -> e.age > 30).forEach((e) -> {
            e.age = 2;
            System.out.println("two" + e.firstName + " " + e.age);
        });

        newPeople.stream().forEach((e) -> System.out.println("three" + e.firstName + " " + e.age));

        newPeople.stream().forEach((e) -> {
            count += 1;
            System.out.println(count);
        });

        List<Person> p = new ArrayList<>();
        newPeople.stream().forEach((e) -> {
            p.add(e);
            System.out.println(e.age);
        });

        p.stream().forEach(r1 -> System.out.println(r1.getAge()));



        Optional<Person> p1 = newPeople.stream().filter(e1 -> e1.age > 1110).findFirst();
        System.out.println(p1.isPresent());

        newPeople.stream().map(m -> m.getAge());

        Set<Integer> seen = Collections.synchronizedSet(new HashSet<>());
        newPeople.stream().parallel().map(e2 -> {
            if (seen.add(e2.getAge())) return 0;
            else return e2;
        });
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

}
