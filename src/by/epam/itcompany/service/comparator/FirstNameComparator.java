package by.epam.itcompany.service.comparator;

import by.epam.itcompany.entity.Employee;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
