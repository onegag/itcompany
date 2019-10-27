package by.epam.itcompany.creator.creatorimpl;

import by.epam.itcompany.entity.Employee;
import by.epam.itcompany.entity.ProjectManager;

import java.util.List;

public class ProjectManagerCreator extends EmployeeCreator {
    @Override

    public Employee create(List<String> fields) {
        ProjectManager projectManager = new ProjectManager();
        setCommonFields(fields, projectManager);
        projectManager.setProjectsCounter(Integer.parseInt(fields.get(6)));
        return projectManager;
    }
}
