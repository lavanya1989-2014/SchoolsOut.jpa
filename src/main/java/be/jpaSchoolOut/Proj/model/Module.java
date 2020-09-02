package be.jpaSchoolOut.Proj.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Module {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private  String descrition;

    @ManyToOne
    @JoinColumn (name = "courseid_FK")
    private Couse course;

    @OneToMany(mappedBy = "module")
    @JoinColumn (name = "examid_FK")
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

    public Couse getCourse() {
        return course;
    }

    public void setCourse(Couse course) {
        this.course = course;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
}
