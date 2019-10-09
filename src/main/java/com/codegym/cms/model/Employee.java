package com.codegym.cms.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private LocalDate birthDate;
    private  int salary;
    private String avatar;

    public Employee() {
    }

    public Employee(String name, String address, LocalDate birthDate, int salary, String avatar) {
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.salary = salary;
        this.avatar = avatar;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, name, address,avatar,birthDate,salary);
    }
}
