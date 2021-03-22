package com.sample.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Class implements Serializable {
    private List<Student> students;
    private Map<String, Integer> grades;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Class{" +
                "students=" + students +
                ", grades=" + grades +
                '}';
    }
}
