package by.epam.itcompany.entity;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee {

    final long EmployeeId;
    String firstName;
    String secondName;
    int salary;
    LocalDate startWork;


    public Employee() {
        EmployeeId = IdGenerator.generateId();
    }

    public long experience() {
        return Duration.between(startWork.atStartOfDay(), LocalDate.now().atStartOfDay()).toDays();
    }


    public long getEmployeeId() {
        return EmployeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getStartWork() {
        return startWork;
    }

    public void setStartWork(LocalDate startWork) {
        this.startWork = startWork;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return EmployeeId == employee.EmployeeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(EmployeeId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", startWork=" + startWork +
                '}';
    }

}
