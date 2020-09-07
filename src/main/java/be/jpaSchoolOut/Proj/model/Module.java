package be.jpaSchoolOut.Proj.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @Lob
    private  String descrition;

    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private Course course;

    @OneToMany(mappedBy = "module",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private List<Exam> exams = new ArrayList<Exam>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
}
