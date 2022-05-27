package ru.alishev.springcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alishev.springcourse.dao.DAO;
import ru.alishev.springcourse.models.Person;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonServiceMVC implements ServiceMVC {
    private DAO dao;

    @Autowired
    public PersonServiceMVC(DAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Person> index() {
        return dao.index();
    }

    @Override
    public Person show(int id) {
        return dao.show(id);
    }

    @Override
    public void save(Person person) {
        dao.save(person);
    }

    @Override
    public void update(int id, Person updatedPerson) {
        dao.update(id, updatedPerson);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }
}
