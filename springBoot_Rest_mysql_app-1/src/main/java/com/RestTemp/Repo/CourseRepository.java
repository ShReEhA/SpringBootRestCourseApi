package com.RestTemp.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestTemp.Binding.Course;


public interface CourseRepository extends JpaRepository<Course, Serializable >{

}
