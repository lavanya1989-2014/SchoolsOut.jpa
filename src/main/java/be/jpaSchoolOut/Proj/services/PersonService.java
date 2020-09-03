package be.jpaSchoolOut.Proj.services;

import be.jpaSchoolOut.Proj.data.PersonRepository;
import be.jpaSchoolOut.Proj.model.Person;

import java.util.List;

public class PersonService {

    PersonRepository personRepository = new PersonRepository();
    Person person = new Person();

    public void createPerson(Person person)
    {
       personRepository.createPerson(person);
    }

    public void updatePerson(Person person)
    {
        personRepository.updatePerson(person);
    }

    public Person getPersonbyId(long id)
    {
        return personRepository.getPersonbyId(id);
    }

    public void delPerson(long id)
    {
        personRepository.delPerson(id);
    }

    public List<Person> getAllPersons()
    {
        return personRepository.getAllPersons();
    }
}
