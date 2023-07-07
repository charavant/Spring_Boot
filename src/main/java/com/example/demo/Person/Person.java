package com.example.demo.Person;

import java.time.LocalDate;

public class Person {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate contact_date;
    private Integer family_members;
    private String details;
    private Long mobile;
    private String address;

    public Person(Long id,
                  String name,
                  Integer age,
                  LocalDate contact_date,
                  Integer family_members,
                  String details,
                  Long mobile,
                  String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact_date = contact_date;
        this.family_members = family_members;
        this.details = details;
        this.mobile = mobile;
        this.address = address;
    }

    public Person() {
    }

    public Person(String name,
                  Integer age,
                  LocalDate contact_date,
                  Integer family_members,
                  String details,
                  Long mobile,
                  String address) {
        this.name = name;
        this.age = age;
        this.contact_date = contact_date;
        this.family_members = family_members;
        this.details = details;
        this.mobile = mobile;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getContact_date() {
        return contact_date;
    }

    public void setContact_date(LocalDate contact_date) {
        this.contact_date = contact_date;
    }

    public Integer getFamily_members() {
        return family_members;
    }

    public void setFamily_members(Integer family_members) {
        this.family_members = family_members;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contact_date=" + contact_date +
                ", family_members=" + family_members +
                ", details='" + details + '\'' +
                ", mobile=" + mobile +
                ", address='" + address + '\'' +
                '}';
    }
}