package by.epam.itcompany.service;

import by.epam.itcompany.entity.Team;
import by.epam.itcompany.entity.Employee;

import java.util.List;

public interface TeamManager {
    double costPerHour(Team team);

    List<Employee> salaryFilter(Team team, int from, int to);

    void sortBySalary(Team team);

    void sortByName(Team team);

    void sortByPositionAndExperience(Team team);


}
