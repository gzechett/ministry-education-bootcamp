package com.nttdata.formacao.ministryeducationapi.services;

import com.nttdata.formacao.ministryeducationapi.entities.StudentEntity;
import com.nttdata.formacao.ministryeducationapi.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private IStudentRepository studentRepository;

    public StudentEntity getStudentById(long id) {
        return studentRepository.findById(id).get();
    }

    public List<StudentEntity> getAllStudents(){
        return studentRepository.findAll();
    }

    public void saveStudent(StudentEntity student){
        studentRepository.save(student);
    }

    public void deleteStudent(StudentEntity student){
        studentRepository.delete(student);
    }
}
