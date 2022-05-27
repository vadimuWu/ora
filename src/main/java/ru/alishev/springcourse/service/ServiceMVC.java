package ru.alishev.springcourse.service;

import ru.alishev.springcourse.models.Person;

import java.util.List;

public interface ServiceMVC {
    List<Person> index();

    Person show(int id);

    void save(Person person);

    void update(int id, Person updatedPerson);

    void delete(int id);
}
