package com.nttdata.formacao.ministryeducationapi.services;

import com.nttdata.formacao.ministryeducationapi.entities.EducationalYearEntity;
import com.nttdata.formacao.ministryeducationapi.repositories.IEducationalYearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationalYearService {

    @Autowired
    private IEducationalYearRepository educationalYearRepository;

    public EducationalYearEntity getEducationalYearByAge(int age) {
        return educationalYearRepository.findById(age).get();
    }

    public List<EducationalYearEntity> getAllEducationalYears(){
        return educationalYearRepository.findAll();
    }
}
