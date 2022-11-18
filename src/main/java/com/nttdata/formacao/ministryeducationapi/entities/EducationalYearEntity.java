package com.nttdata.formacao.ministryeducationapi.entities;

import javax.persistence.*;

@Entity
@Table(name="Educational_Year_Structure")
public class EducationalYearEntity {

    @Column(name="School_year")
    private String schoolYear;

    @Id
    private int age;

    @Column(name="School_Stage", nullable = false)
    private String schoolStage;

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolStage() {
        return schoolStage;
    }

    public void setSchoolStage(String schoolStage) {
        this.schoolStage = schoolStage;
    }
}
