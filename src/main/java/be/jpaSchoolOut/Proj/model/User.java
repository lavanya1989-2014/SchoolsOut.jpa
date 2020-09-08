package be.jpaSchoolOut.Proj.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    private String login;
    private String passwaordhash;
    private boolean active;

    @OneToOne(fetch = FetchType.EAGER,targetEntity = Person.class,cascade = CascadeType.PERSIST)
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


    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", passwaordhash='" + passwaordhash + '\'' +
                ", active=" + active +
                ", person=" + person + '}' +'\n';
    }
}
