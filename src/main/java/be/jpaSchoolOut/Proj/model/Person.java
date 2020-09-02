package be.jpaSchoolOut.Proj.model;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstname;
    private String familyname;

    @OneToOne(mappedBy = "person")
    private User user;

    @ManyToOne
    @JoinColumn(name = "courseid_FK")
    private Couse course;

    @Enumerated(EnumType.STRING)
    private Gender gender;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Couse getCourse() {
        return course;
    }

    public void setCourse(Couse course) {
        this.course = course;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
