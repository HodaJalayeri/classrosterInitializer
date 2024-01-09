package com.sg.classrosterInitializer.dao;

import com.sg.classrosterInitializer.model.Course;
import com.sg.classrosterInitializer.model.Student;
import com.sg.classrosterInitializer.model.Teacher;

import java.util.List;

public interface CourseDao {
    Course getCourseById(int id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourseById(int id);

    List<Course> getCoursesForTeacher(Teacher teacher);
    List<Course> getCoursesForStudent(Student student);
}
