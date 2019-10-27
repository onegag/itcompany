package by.epam.itcompany.creator;

import by.epam.itcompany.creator.creatorimpl.DeveloperCreator;
import by.epam.itcompany.creator.creatorimpl.ProjectManagerCreator;
import by.epam.itcompany.creator.creatorimpl.TesterCreator;
import by.epam.itcompany.creator.validatorimpl.DeveloperValidator;
import by.epam.itcompany.creator.validatorimpl.ProjectManagerValidator;
import by.epam.itcompany.creator.validatorimpl.TesterValidator;
import by.epam.itcompany.entity.Employee;
import by.epam.itcompany.exception.WrongEmployeeFormatException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


 class EmployeeFactory {

    public static final String REGEX_DELIMITER = "\\s+";

    Creator creator;
    List<String> fields = new ArrayList<>();
    Validator validator;


    private void parse(String line) {
        line = line.trim();
        fields = Arrays.asList(line.split(REGEX_DELIMITER));

    }

     Employee choose(String line) throws WrongEmployeeFormatException {
        parse(line);
        if (fields.get(4).equalsIgnoreCase("project")) {
            validator = new ProjectManagerValidator();
            creator = new ProjectManagerCreator();

        } else if (fields.get(4).equalsIgnoreCase("tester")) {
            validator = new TesterValidator();
            creator = new TesterCreator();


        } else if (fields.get(4).equalsIgnoreCase("developer")) {
            validator = new DeveloperValidator();
            creator = new DeveloperCreator();
        } else {
            throw new WrongEmployeeFormatException();
        }

        if (validator.check(fields)[4]) {
            return creator.create(fields);
        } else throw new WrongEmployeeFormatException();

    }


}
