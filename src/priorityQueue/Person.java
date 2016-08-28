package priorityQueue;

/**
 * Created by zhaoguanjun on 2016/8/28.
 */
public class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
