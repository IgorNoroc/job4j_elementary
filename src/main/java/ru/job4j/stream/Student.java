package ru.job4j.stream;

import java.util.Objects;

/**
 *  1. Фильтрация учеников.[#257387]
 */
public class Student {
    private String  surname;
    private int score;

    public Student(int score) {
        this.score = score;
    }

    public Student(String surname, int score) {
        this.surname = surname;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }
}
