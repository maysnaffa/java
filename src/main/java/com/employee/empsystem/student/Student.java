package com.employee.empsystem.student;


import java.time.LocalDate;




public class Student {

    private long id;
    private LocalDate dateOfBirth;
    private Integer age;
    private String name;
    private String email;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
  

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    

    public Student() {
    }



public LocalDate getDateOfBirth() {
    return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}
 
    
}
