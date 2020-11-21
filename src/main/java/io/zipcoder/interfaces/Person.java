package io.zipcoder.interfaces;

public class Person {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public Person(String name)
    {
        this.name=name;
    }



}
