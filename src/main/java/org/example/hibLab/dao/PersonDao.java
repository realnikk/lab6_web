package org.example.hibLab.dao;

import org.example.hibLab.entity.Person;
import org.example.hibLab.entity.User;

import java.util.List;

public interface PersonDao {
    boolean addPerson(Person person);
    boolean updatePerson(Person person);
    boolean deletePerson(int id);
    List<Person> showPeople();
    Person findPersonById(int id);
}
