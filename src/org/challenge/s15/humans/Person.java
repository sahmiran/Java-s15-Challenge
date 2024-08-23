package org.challenge.s15.humans;

import org.challenge.s15.interfaces.Whoareyou;

public abstract class Person implements Whoareyou {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract void whoareyou();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
