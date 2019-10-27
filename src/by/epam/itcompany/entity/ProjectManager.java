package by.epam.itcompany.entity;


public class ProjectManager extends Employee {
    private int projectsCounter;


    public ProjectManager() {
    }

    public int getProjectsCounter() {
        return projectsCounter;
    }

    public void setProjectsCounter(int projectsCounter) {
        this.projectsCounter = projectsCounter;
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "EmployeeId=" + EmployeeId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", salary=" + salary +
                ", startWork=" + startWork +
                "projectsCounter=" + projectsCounter +
                '}';
    }
}
