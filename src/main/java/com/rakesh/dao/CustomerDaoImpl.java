package com.rakesh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rakesh.bean.Customer;

@Repository("customerDAO")
@Transactional(propagation= Propagation.REQUIRED)
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		Session session  = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Customer> customer = session.createQuery("from Customer").list();
		return customer;
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session session  = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);

	}

	@Override
	public Customer getCustomer(int id) {
		Session session  = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class,id);
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		Session session  = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class,id);
		session.delete(customer);
	}

}
