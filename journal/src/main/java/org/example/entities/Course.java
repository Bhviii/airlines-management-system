package org.example.entities;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue
    @Column(name = "COURSE_ID")
    private Long courseId;


    @Column(name = "COURSE_NAME")
    private String courseName;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "JOIN_STUDENT_COURSE",
            joinColumns =  {@JoinColumn(name = "COURSE_ID_FK") },
            inverseJoinColumns = {@JoinColumn(name = "STUDENT_ID_FK")}
    )
    private Set<Student> students;

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
