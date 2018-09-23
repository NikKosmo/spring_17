package ru.otus.spring_17.damain;

public class Genre {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                ", name='" + name + '\'' +
                '}';
    }
}
