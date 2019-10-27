package by.epam.itcompany.creator.validatorimpl;

import by.epam.itcompany.creator.Validator;

import java.util.List;
import java.util.regex.Pattern;

public abstract class EmployeeValidator implements Validator {
    @Override
    public boolean[] check(List<String> fields) {
        boolean[] correctFields = new boolean[4];

        Pattern nameRegex = Pattern.compile("[A-zА-я]+");
        Pattern salaryRegex = Pattern.compile("\\d+");
        Pattern startWorkRegex = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");


        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                case 1:
                    correctFields[i] = nameRegex.matcher(fields.get(i)).find();
                    break;
                case 2:
                    correctFields[i] = salaryRegex.matcher(fields.get(i)).find();
                    break;
                case 3:
                    correctFields[i] = startWorkRegex.matcher(fields.get(i)).find();
                    break;
            }

        }
        return correctFields;
    }

    <E extends Enum<E>> boolean isInEnum(String value, Class<E> enumClass) {
        for (E e : enumClass.getEnumConstants()) {
            if (e.name().equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
}
