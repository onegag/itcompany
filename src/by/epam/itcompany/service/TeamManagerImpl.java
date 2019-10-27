package by.epam.itcompany.service;

import by.epam.itcompany.entity.Team;
import by.epam.itcompany.entity.Employee;
import by.epam.itcompany.service.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeamManagerImpl implements TeamManager {
    ArrayList<Employee> teamMembers;
    final double workHoursPerMonth = 160.0;

    @Override
    public double costPerHour(Team team) {

        double cost = 0;
        teamMembers = team.getAllEmployees();
        for (Employee employee : teamMembers) {
            cost += employee.getSalary() / workHoursPerMonth;
        }
        return cost;
    }

    @Override
    public List<Employee> salaryFilter(Team team, int from, int to) {
        teamMembers = team.getAllEmployees();
        ArrayList<Employee> filtered = new ArrayList<>();
        for (Employee employee : teamMembers) {
            if (employee.getSalary() > from && employee.getSalary() < to) filtered.add(employee);
        }
        return filtered;
    }

    @Override
    public void sortBySalary(Team team) {
        SalaryComparator salaryComparator = new SalaryComparator();
        Collections.sort(team.getAllEmployees(), salaryComparator);
    }

    @Override
    public void sortByName(Team team) {
        Comparator nameComparator = new SecondNameComparator().thenComparing(new FirstNameComparator());
        Collections.sort(team.getAllEmployees(), nameComparator);

    }

    @Override
    public void sortByPositionAndExperience(Team team) {
        Comparator positionAndExperience = new PositionComparator().thenComparing(new ExperienceComparator());
        Collections.sort(team.getAllEmployees(), positionAndExperience);
    }
}
