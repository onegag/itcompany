package by.epam.itcompany.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Team extends ArrayList {
    private long teamId;
    private ArrayList<Employee> employees;

    public Team() {
        teamId = IdGenerator.generateId();
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    public ArrayList<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Team team = (Team) o;
        return teamId == team.teamId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teamId);
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", employees=" + employees.size() +
                '}';
    }
}
