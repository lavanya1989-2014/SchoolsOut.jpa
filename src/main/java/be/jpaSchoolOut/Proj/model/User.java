package be.jpaSchoolOut.Proj.model;

import be.jpaSchoolOut.Proj.model.Person;

import javax.persistence.*;

@Entity
public class User {

    @Id
    private String login;
    private String passwaordhash;
    private boolean active;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Person person;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswaordhash() {
        return passwaordhash;
    }

    public void setPasswaordhash(String passwaordhash) {
        this.passwaordhash = passwaordhash;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }



}
