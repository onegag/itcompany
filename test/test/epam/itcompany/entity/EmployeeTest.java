package test.epam.itcompany.entity;

import by.epam.itcompany.entity.Developer;
import by.epam.itcompany.entity.Employee;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class EmployeeTest {
    @Test(description = "method is checking if experience counter works right")
    public void experiencePositive(){
        Employee employee = new Developer();
        LocalDate localDate = LocalDate.now().minusDays(3000);
        employee.setStartWork(localDate);
        long actual = employee.experience();
        long expected = 3000;
        Assert.assertEquals(actual,expected,"Test wrong");

    }
}
