package com.nttdata.formacao.ministryeducationapi.repositories;

import com.nttdata.formacao.ministryeducationapi.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<StudentEntity, Long> {
}
