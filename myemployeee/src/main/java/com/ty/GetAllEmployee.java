package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllEmployee {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
//		Query query=entityManager.createQuery("select e from Employee e");
		
		Query query=entityManager.createQuery("select e from Employee e where e.id=?1 and e.age=?2");
		
		query.setParameter(1,5);
		query.setParameter(2,22);

		List<Employee> list=query.getResultList();
		
		for (Employee eployeees : list) {
			System.out.println("id is :"+eployeees.getId());
			System.out.println("name is :"+eployeees.getName());
			System.out.println("age is :"+eployeees.getAge());
			System.out.println("gender is :"+eployeees.getGender());
			System.out.println("pan no is :"+eployeees.getPanNo());
			System.out.println("sal is :"+eployeees.getSal());
			System.out.println("phone no is :"+eployeees.getPhno());
			
			System.out.println("==========================================");
			
		}
	}
}
