package ru.alishev.springcourse.service;

import ru.alishev.springcourse.models.Person;

import java.util.List;

public interface ServiceMVC {
    List<Person> index();

    Person show(int id);

    void save(Person person);

    void update(Person person);

    void delete(int id);
}
