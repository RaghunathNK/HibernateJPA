package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveEmployee {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee=new Employee();
		employee.setName("raghu");
		employee.setAge(22);
		employee.setGender("male");
		employee.setPanNo(3876468);
		employee.setPhno(27877);
		employee.setSal(2425526.0);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
}
