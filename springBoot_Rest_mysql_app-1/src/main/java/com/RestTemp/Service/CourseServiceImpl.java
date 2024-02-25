package com.RestTemp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestTemp.Binding.Course;
import com.RestTemp.Repo.CourseRepository;
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public String upsert(Course course) {
		courseRepo.save(course);   // upsert (insert / update based upon pk)
		return "Sucess";	
	}
	
	@Override
	public Course getById(Integer cid) {  // based on the given id we need to 	retrieve record and return the record 
		
		Optional<Course> findById = courseRepo.findById(cid);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}
	
	@Override
	public List<Course> getAllCourses() {
		
		return courseRepo.findAll();
	}
	@Override
	public String deleteById(Integer Cid) {
		
		if (courseRepo.existsById(Cid)) {
		 courseRepo.deleteById(Cid);
		 return "Delete Sucessfully";
		}
		
		else {
			return "No record Found";
		}
	}


}
