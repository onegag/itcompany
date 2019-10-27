package by.epam.itcompany.creator.creatorimpl;

import by.epam.itcompany.entity.Employee;
import by.epam.itcompany.entity.Tester;
import by.epam.itcompany.entity.type.Position;
import by.epam.itcompany.entity.type.TesterType;

import java.util.List;

public class TesterCreator extends EmployeeCreator {

    @Override
    public Employee create(List<String> fields) {
        Tester tester = new Tester();
        setCommonFields(fields, tester);
        switch (fields.get(5).toLowerCase()) {
            case "functional":
                tester.setTesterType(TesterType.FUNCTIONAL);
                break;
            case "automation":
                tester.setTesterType(TesterType.AUTOMATION);
                break;
        }
        switch (fields.get(6).toLowerCase()) {
            case "junior":
                tester.setPosition(Position.JUNIOR);
            case "middle":
                tester.setPosition(Position.MIDDLE);
            case "senior":
                tester.setPosition(Position.SENIOR);
            case "lead":
                tester.setPosition(Position.LEAD);
        }
        return tester;
    }
}
