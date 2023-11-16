package com.springboot.cruddemo.DAO;

import com.springboot.cruddemo.Entity.student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {
@Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private EntityManager entityManager;
    @Override
    @Transactional
    public void save(student thestudent) {
      entityManager.persist(thestudent);
    }

    @Override
    public student findbyid(Integer id) {
        return entityManager.find(student.class,id);
    }

    @Override
    public List<student> findAll() {
        TypedQuery<student> theQuery=entityManager.createQuery("From student order by lastname",student.class
        );
        return theQuery.getResultList();
    }


    @Override
    public List<student> findbylastname(String thelastname) {
        TypedQuery<student> theQuery=entityManager.createQuery("From student where lastname=:theData",student.class
        );
        theQuery.setParameter("theData",thelastname);
        return theQuery.getResultList();
    }

    @Override
    public List<student> findAll(String thelastname) {
        return null;
    }


}
