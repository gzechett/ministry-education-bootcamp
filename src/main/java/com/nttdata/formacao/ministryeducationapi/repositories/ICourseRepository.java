package com.nttdata.formacao.ministryeducationapi.repositories;

import com.nttdata.formacao.ministryeducationapi.entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<CourseEntity, Long> {
}
