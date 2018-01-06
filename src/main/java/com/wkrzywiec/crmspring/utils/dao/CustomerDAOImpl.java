package com.wkrzywiec.crmspring.utils.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wkrzywiec.crmspring.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		
		Query<Customer> query = getCurrentSession().createQuery("from Customer order by lastName", Customer.class);
		
		List<Customer> list = query.getResultList();
		
		return list;
	}
	
	@Override
	public void saveCustomer(Customer customer) {
		getCurrentSession().save(customer);
	}
	
	protected Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}



}
