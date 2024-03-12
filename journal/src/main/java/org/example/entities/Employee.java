package org.example.entities;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id @GeneratedValue @Column(name = "EMPLOYEE_ID")
    private int empId;

    @Column(name = "EMPLOYEE_NAME")
    private String empName;

    @OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="EMPDETAIL_FK")
    private EmployeeDetails employeeDetails;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public EmployeeDetails getEMployeeDetail() {
        return employeeDetails;
    }

    public void setEmployeeDetail(EmployeeDetails employeeDetails) {
        this.employeeDetails= employeeDetails;
    }
}
