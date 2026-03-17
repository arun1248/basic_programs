package collection;

import java.util.Objects;

public class User {

    String name;
    int id;
    int age;

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) {
//        System.out.println("getClass() "+getClass());
//        System.out.println("o.getClass() "+o.getClass());
//
//        if (o == null || getClass() != o.getClass())
//            return false;
//
//        User user = (User) o;
//        return id == user.id && age == user.age && Objects.equals(name, user.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, id, age);
//    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User user))
//            System.out.println(user);
            return false;
        return id == user.id && age == user.age && Objects.equals(name, user.name); // name.equals(user.name),
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode");
        return Objects.hash(name, id, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
