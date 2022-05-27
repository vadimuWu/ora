package ru.alishev.springcourse.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.alishev.springcourse.models.Person;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class PersonDAO implements DAO {

    @PersistenceContext
    private EntityManager entityManager;

    protected EntityManager getEntityManager() {
        return this.entityManager;
    }

    @Override
    public List<Person> index() {
        return getEntityManager().createQuery("select u from Person u").getResultList();
    }

    @Override
    public Person show(int id) {
        return getEntityManager().find(Person.class, id);
    }

    @Override
    public void save(Person person) {
        getEntityManager().persist(person);
    }

    @Override
    public void update(Person person) {
        getEntityManager().merge(person);
    }

    @Override
    public void delete(int id) {
        getEntityManager()
                .createQuery("delete from Person where id=: id")
                .setParameter("id", id)
                .executeUpdate();
    }

}
