package by.epam.itcompany.creator;

import by.epam.itcompany.entity.Employee;

import java.util.List;

public interface Creator {

    Employee create(List<String> fields);
}
