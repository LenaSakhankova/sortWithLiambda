package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User {
    private String name;
    private int age;

    User(String name, int age)
    {
        this.age = age; this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", 28),
                new User("Jane", 35),
                new User("Alex", 21));

        System.out.println("Before sort:");
        for (User user : users) {
            System.out.println(user.toString());
        }
//List sort
        users.sort((o1, o2) -> o1.getAge() - o2.getAge());

        System.out.println("\nAfter sort for age:");
        for (User user : users) {
            System.out.println(user);
        }

        users.sort((o1,o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println("\nAfter sort for name:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
