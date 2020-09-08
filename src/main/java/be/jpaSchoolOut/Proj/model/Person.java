package be.jpaSchoolOut.Proj.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String familyname;

    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JoinColumn(name = "courseid_FK")
    private Course courseActive;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToMany
    private List<Course> courseHistory = new ArrayList<>();

    public Course getCourseActive() {
        return courseActive;
    }

    public void setCourseActive(Course courseActive) {
        this.courseActive = courseActive;
    }

    public List<Course> getCourseHistory() {
        return courseHistory;
    }

    public void setCourseHistory(List<Course> courseHistory) {
        this.courseHistory = courseHistory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public Course getCourse() {
        return courseActive;
    }

    public void setCourse(Course course) {
        this.courseActive = course;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", familyname='" + familyname + '\'' +
                ", courseActive=" + courseActive +
                ", gender=" + gender +
                ", courseHistory=" + courseHistory + '}'+'\n';
    }
}
