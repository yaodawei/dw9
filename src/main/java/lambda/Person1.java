package lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by dwy on 2015/10/28.
 */
public class Person1 {
    public String firstName;
    public String lastName;
    public int age;
    public Person1(String f, String l, int a) {
        firstName = f; lastName = l; age = a;
    }

    public final static Comparator<Person1> compareFirstName =
            (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName);

    public final static Comparator<Person1> compareLastName =
            (lhs, rhs) -> lhs.lastName.compareTo(rhs.lastName);

    public static int compareFirstNames(Person1 lhs, Person1 rhs) {
        return lhs.firstName.compareTo(rhs.firstName);
    }

    public String toString() {
        return "[Person: firstName:" + firstName + " " +
                "lastName:" + lastName + " " +
                "age:" + age + "]";
    }


    public static void main(String... args) {
        Person1[] people = new Person1[] {
                new Person1("Ted", "Neward", 41),
                new Person1("Charlotte", "Neward", 41),
                new Person1("Michael", "Neward", 19),
                new Person1("Matthew", "Neward", 13)
        };

        Arrays.sort(people, Person1.compareFirstName);
        for (Person1 p : people)
            System.out.println(p);

        Arrays.sort(people, Person1::compareFirstNames);
        for (Person1 p : people)
            System.out.println(p);

        Arrays.sort(people, Person1.compareLastName);
        for (Person1 p : people)
            System.out.println(p);

        Comparator<Person1> byName = Comparator.comparing(p -> p.getAge());
        Arrays.sort(people, byName);


    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
