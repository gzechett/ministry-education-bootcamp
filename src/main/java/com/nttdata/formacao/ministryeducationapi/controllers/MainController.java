package com.nttdata.formacao.ministryeducationapi.controllers;

import com.nttdata.formacao.ministryeducationapi.entities.CourseEntity;
import com.nttdata.formacao.ministryeducationapi.entities.EducationalYearEntity;
import com.nttdata.formacao.ministryeducationapi.services.CourseService;
import com.nttdata.formacao.ministryeducationapi.validators.StudentValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentValidator studentValidator;

    @RequestMapping(path = "/courses", method = RequestMethod.GET)
    public List<CourseEntity> getAllCourses() {
        return courseService.getAllCourses();
    }

    @RequestMapping(path = "validate/educational-year/{age}", method = RequestMethod.GET)
    public List<EducationalYearEntity> validateStudentEducationalYear(@PathVariable(name = "age") int age) {
        return studentValidator.validateStudentEducationalYear(age);
    }
}
