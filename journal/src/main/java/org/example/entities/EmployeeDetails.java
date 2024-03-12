package org.example.entities;

import jakarta.persistence.*;

@Entity
public class EmployeeDetails {

    @Id
    @GeneratedValue
    @Column(name = "EMPDETAIL_ID")
    int studentDetailId;

    @Column(name = "INCOME")
    int income;

    @OneToOne(mappedBy = "employeedetail", cascade = CascadeType.ALL)
    private Employee emp;

    public int getStudentDetailId() {
        return studentDetailId;
    }

    public void setStudentDetailId(int studentDetailId) {
        this.studentDetailId = studentDetailId;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }
}
