package com.springboot.cruddemo.DAO;

import com.springboot.cruddemo.Entity.student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
