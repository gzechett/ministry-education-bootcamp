package com.nttdata.formacao.ministryeducationapi.repositories;

import com.nttdata.formacao.ministryeducationapi.entities.EducationalYearEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEducationalYearRepository extends JpaRepository<EducationalYearEntity, Integer> {
}
