package ru.alishev.springcourse.dao;

import ru.alishev.springcourse.models.Person;

import java.util.List;

public interface DAO {
    List<Person> index();

    Person show(int id);

    void save(Person person);

    void update(int id, Person updatedPerson);

    void delete(int id);
}
