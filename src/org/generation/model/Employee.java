package org.generation.model;

public class Employee {
    //Atributos
    protected Long idEmployee;
    protected String fullName;
    protected String position;
    protected Double salary;

    //Constructor
    public Employee(Long idEmployee, String fullName, String position, Double salary) {
        this.idEmployee = idEmployee;
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
    }

    //Metodos get y set
    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Employee\n" +
                "idEmployee: " + idEmployee +
                ", fullName: " + fullName +
                ", position='" + position +
                ", salary=" + salary;
    }
}
