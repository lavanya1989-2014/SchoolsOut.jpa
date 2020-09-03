package be.jpaSchoolOut.Proj.model;

import be.jpaSchoolOut.Proj.model.Module;
import be.jpaSchoolOut.Proj.model.Person;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Couse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @Lob
    private String description;
    private String code;
    private String imageURL;
    private boolean active;


    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    private List<Module> modules = new ArrayList<Module> ();


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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}
