package by.epam.itcompany.service.comparator;

import by.epam.itcompany.entity.Employee;

import java.util.Comparator;

public class ExperienceComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.experience() - o2.experience());
    }
}
