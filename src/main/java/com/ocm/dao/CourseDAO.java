package com.ocm.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ocm.bean.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public interface CourseDAO {
	
	

	public void addcourse(Course course);
	 
	List<Course> getallcourse();
	
	public Course getcourse(int id);
	 
//
//	 public List<Course> findAll() {
//       return entityManager.createQuery("select course FROM Course course", Course.class).getResultList();
//   }
//
//	 public Course findById(int id) {
//		    return entityManager.find(Course.class, id);
//		}
	 
	 
	

	
}
