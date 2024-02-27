package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetEmployee {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Employee employee=entityManager.find(Employee.class,4);
		
		System.out.println("id is :"+employee.getId());
		System.out.println("name is :"+employee.getName());
		System.out.println("age is :"+employee.getAge());
		System.out.println("gender is :"+employee.getGender());
		System.out.println("pan no is :"+employee.getPanNo());
		System.out.println("sal is :"+employee.getSal());
		System.out.println("phone no is :"+employee.getPhno());
		
	}
}
