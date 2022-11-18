package com.nttdata.formacao.ministryeducationapi.validators;

import com.nttdata.formacao.ministryeducationapi.entities.EducationalYearEntity;
import com.nttdata.formacao.ministryeducationapi.entities.StudentEntity;
import com.nttdata.formacao.ministryeducationapi.services.EducationalYearService;
import com.nttdata.formacao.ministryeducationapi.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentValidator {

    @Autowired
    private StudentService studentService;

    @Autowired
    private EducationalYearService educationalYearService;

    public List<EducationalYearEntity> validateStudentEducationalYear(int age) {

        List<EducationalYearEntity> educationalList = educationalYearService.getAllEducationalYears();
        educationalList.removeIf(educationalYearEntity -> educationalYearEntity.getAge()>age);

        //Funciona assim
//        List<EducationalYearEntity> educationalList = educationalYearService.getAllEducationalYears();
//        List<EducationalYearEntity> toDelete = new ArrayList<EducationalYearEntity>();
//        for(EducationalYearEntity educationalYear : educationalList) {
//            if(educationalYear.getAge()>age) {
//                toDelete.add(educationalYear);
//            }
//        }
//        educationalList.removeAll(toDelete);

        return educationalList;
    }
}
