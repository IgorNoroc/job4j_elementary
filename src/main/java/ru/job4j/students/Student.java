package ru.job4j.students;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  0. Stream API улучшения[#257394]
 */
public class Student implements Comparable<Student> {
    private String name;
    private int scope;

    public Student(String name, int scope) {
        this.name = name;
        this.scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return scope == student.scope
                && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, scope);
    }

    public int getScope() {
        return scope;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", scope=" + scope +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
