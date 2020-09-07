package be.jpaSchoolOut.Proj.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @Lob
    private String description;
    private LocalDate date;
    private int weight;
    private int total;

    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn (name = "moduleid_FK")
    private Module module;


    @ManyToOne (targetEntity = Exam.class,cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JoinColumn ( name = "subexam_id")
    private Exam parentExam;

    @OneToMany ( mappedBy = "parentExam",targetEntity = Exam.class,fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    private List<Exam> subExams = new ArrayList<>();

    @OneToMany ( mappedBy = "exam",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    private List<Grade> grade = new ArrayList<>();
    /*public Exam(long id, String description, Exam parentExam, List<Exam> subExams, Grade grade) {
        this.id = id;
        this.description = description;
        this.parentExam = parentExam;
        this.subExams = subExams;
        this.grade = grade;
    }

    public Exam() {
    }*/

    public List<Grade> getGrade() {
        return grade;
    }

    public void setGrade(List<Grade> grade) {
        this.grade = grade;
    }

    public Exam getParentExam() {
        return parentExam;
    }

    public void setParentExam(Exam examGroup) {
        this.parentExam = examGroup;
    }

    public List<Exam> getSubExams() {
        return subExams;
    }

    public void setSubExams(List<Exam> subExams) {
        this.subExams = subExams;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }
}
