package com.nttdata.formacao.ministryeducationapi.services;

import com.nttdata.formacao.ministryeducationapi.entities.CourseEntity;
import com.nttdata.formacao.ministryeducationapi.repositories.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private ICourseRepository courseRepository;

    public CourseEntity getCourseById(long id){
        return courseRepository.findById(id).get();
    }

    public List<CourseEntity> getAllCourses(){
        return courseRepository.findAll();
    }

    public void saveCourse(CourseEntity course) {
        courseRepository.save(course);
    }

    public void deleteCourse(CourseEntity course) {
        courseRepository.delete(course);
    }
}
