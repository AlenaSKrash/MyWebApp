package com.alena.dao;

import com.alena.entity.Employee;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor
public class EmployeeDaoImplementation implements EmployeeDao {

    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee",Employee.class).getResultList();
    }
}