package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentPk;
import com.example.demo.entity.Student_enty1;


@Repository
public interface stuRepository extends JpaRepository<Student_enty1 ,StudentPk>
{

}