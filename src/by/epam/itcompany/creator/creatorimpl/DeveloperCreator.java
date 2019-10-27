package by.epam.itcompany.creator.creatorimpl;


import by.epam.itcompany.entity.Developer;
import by.epam.itcompany.entity.type.DevLanguage;
import by.epam.itcompany.entity.type.Position;

import java.util.List;

public class DeveloperCreator extends EmployeeCreator {

    @Override
    public Developer create(List<String> fields) {
        Developer developer = new Developer();
        setCommonFields(fields, developer);
        switch (fields.get(5).toLowerCase()) {
            case "java":
                developer.setDevLanguage(DevLanguage.JAVA);
                break;
            case "python":
                developer.setDevLanguage(DevLanguage.PYTHON);
                break;
            case "javascript":
                developer.setDevLanguage(DevLanguage.JAVASCRIPT);
                break;
        }
        switch (fields.get(6).toLowerCase()) {
            case "junior":
                developer.setPosition(Position.JUNIOR);
                break;
            case "middle":
                developer.setPosition(Position.MIDDLE);
                break;
            case "senior":
                developer.setPosition(Position.SENIOR);
                break;
            case "lead":
                developer.setPosition(Position.LEAD);
                break;
        }
        return developer;

    }
}
