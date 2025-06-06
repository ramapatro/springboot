package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student_ent;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository <Student_ent,Integer>{
	
	@Query("from Student_ent where age=:age")
	List<Student_ent> getAllByAge(int age);
	
	@Query("delete from Student_ent where id=:id")
	@Modifying
	@Transactional
	void deletebyid(int id);
	
//	@Query(" Select from Student_ent where age =: age")
//	List<Student_ent> getAllByAge(int age);

//	@Query("Select from Student_ent where name =: name")
//	List<Student_ent> getAllByName(String name);
	
//	@Query("Select from Student_ent where age>=: age")
//	List<Student_ent> getAllByAgee(int age);

	
	
	
	
	
}
