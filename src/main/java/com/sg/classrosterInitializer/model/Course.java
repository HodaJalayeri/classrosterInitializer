package com.sg.classrosterInitializer.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.Objects;

public class Course {
    private int id;
    @NotBlank(message = "Name must not be blank")
    @Size(max = 50, message="Name must be fewer than 50 characters")
    private String name;

    @Size(max = 255, message = "Description must be fewer than 255 characters")
    private String description;

    private Teacher teacher;
    private List<Student> students;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return getId() == course.getId() && Objects.equals(name, course.name) && Objects.equals(description, course.description) && Objects.equals(teacher, course.teacher) && Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), name, description, teacher, students);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
