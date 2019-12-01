package com.myjavablog.dao;

import com.myjavablog.pojo.UserDetails;

import javax.persistence.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager ;

    @Override
    public List getUserDetails() {

        /*final CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<UserDetails> criteria =  criteriaBuilder.createQuery(UserDetails.class);
        return (List) entityManager.createQuery(criteria).getSingleResult();*/
        Criteria criteria;
        criteria = entityManager.unwrap(Session.class).createCriteria(UserDetails.class);
        return criteria.list();

        // Create entity manager factory first
        // Make sure the package name you specify `com.db.entity` matched what you specify in `pesistence.xml`
        /*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.myjavablog.pojo");
        EntityManager em = entityManagerFactory.createEntityManager();


        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UserDetails> cq = cb.createQuery(UserDetails.class);
        //cq.where(cb.equal(join.get("name"), "ordinary"));
        TypedQuery<UserDetails> tq = em.createQuery(cq);
        List<UserDetails> accounts = tq.getResultList();

        return accounts;*/


        /*List<UserDetails> listPersons = entityManager.createQuery("SELECT p FROM UserDetails p").getResultList();

        return listPersons;*/
    }

}
