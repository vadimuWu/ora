package ru.alishev.springcourse.dao;

import ru.alishev.springcourse.models.Person;

import java.util.List;

public interface DAO {
    List<Person> index();

    Person show(int id);

    void save(Person person);

    void update(Person person);

    void delete(int id);
}
