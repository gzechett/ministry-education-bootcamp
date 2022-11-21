package com.nttdata.formacao.ministryeducationapi.validators;

import com.nttdata.formacao.ministryeducationapi.entities.EducationalYearEntity;
import com.nttdata.formacao.ministryeducationapi.services.EducationalYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentValidator {

    @Autowired
    private EducationalYearService educationalYearService;

    public List<EducationalYearEntity> validateStudentEducationalYear(int age) {

        List<EducationalYearEntity> educationalList = educationalYearService.getAllEducationalYears();
        educationalList.removeIf(educationalYearEntity -> educationalYearEntity.getAge()>age);

        return educationalList;
    }
}
