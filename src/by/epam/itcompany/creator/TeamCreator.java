package by.epam.itcompany.creator;

import by.epam.itcompany.entity.Team;
import by.epam.itcompany.exception.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;


public class TeamCreator {
    private File file;
    private List<String> lines;

    public Team collectTeam() {
        try {
            setFile("input/data.txt");

        } catch (WrongFilePathException e) {

        }
        try {
            takeLine();
        } catch (WrongFileDataException e) {

        }

        EmployeeFactory employeeFactory = new EmployeeFactory();
        Team team = new Team();
        for (String line : lines) {
            try {
                team.addEmployee(employeeFactory.choose(line));
            } catch (WrongEmployeeFormatException e) {
                e.printStackTrace();
            }
        }
        return team;
    }


    private File setFile(String filepath) throws WrongFilePathException {
        file = new File(filepath);
        if (PathValidator.check(file)) {
            return file;
        } else {
            throw new WrongFilePathException();
        }
    }

    private List<String> takeLine() throws WrongFileDataException {

        try {
            lines = Files.readAllLines(file.toPath());
            return lines;
        } catch (IOException e) {
            throw new WrongFileDataException();

        }
    }
    private static class PathValidator {


         static boolean check(File file) {

            if (file == null || !file.exists() || file.isDirectory()) {
                return false;
            } else if (file.length() == 0) {
                return false;
            } else return true;
        }


    }


}
