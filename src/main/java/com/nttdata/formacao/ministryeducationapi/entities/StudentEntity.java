package com.nttdata.formacao.ministryeducationapi.entities;

import javax.persistence.*;

@Entity
@Table(name="Student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "registration_number", nullable = false, length = 8, unique = true)
    private String registrationNumber;

    @Column(name = "cc", nullable = false, unique = true, length = 9)
    private String cc;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "gender", nullable = false, columnDefinition = "CHAR")
    private String gender;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name="Educational_Year")
    private String educationalYear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEducationalYear() {
        return educationalYear;
    }

    public void setEducationalYear(String educationalYear) {
        this.educationalYear = educationalYear;
    }
}
