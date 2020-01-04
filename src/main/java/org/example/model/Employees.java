package org.example.model;


import javax.persistence.*;
import java.sql.Date;

@Entity
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_no", nullable = false)
    private Long id;

    @Column(name = "birth_date", nullable = false)
    private Date birthDate;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name= "gender", nullable = false)
    private char gender;


    @Column(name = "hire_date", nullable = false)
    private Date hireDate;


    public Employees() {
        super();
    }
    public Employees(Long id, Date birthDate, String firstName, String lastName, char gender, Date hireDate){
        super();
        this.id=id;
        this.birthDate=birthDate;
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.hireDate=hireDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", birthDate=" + birthDate +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", hireDate=" + hireDate +
                '}';
    }
}
