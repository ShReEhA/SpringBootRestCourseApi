package com.RestTemp.Service;

import java.util.List;

import com.RestTemp.Binding.Course;


public interface CourseService {
	
	public String upsert(Course course);  // one method will perform both insert and update
	
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourses();
	
	
	public String deleteById(Integer Cid);

}

