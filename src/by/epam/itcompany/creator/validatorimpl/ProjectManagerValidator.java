package by.epam.itcompany.creator.validatorimpl;

import java.util.List;
import java.util.regex.Pattern;

public class ProjectManagerValidator extends EmployeeValidator {
    @Override
    public boolean[] check(List<String> fields) {
        boolean[] correctFields = new boolean[fields.size()];
        Pattern counterRegex = Pattern.compile("\\d+");
        correctFields[4]=true;
        boolean[] returnedFields = new boolean[3];


        for (int i = 0; i < fields.size(); i++) {
            switch (i) {
                case 4:
                    super.check(fields);
                    int a =0;
                    for (boolean b: returnedFields) {
                        correctFields[a++]=b;
                    }
                    break;
                case 5:
                    correctFields[i] = fields.get(5).equalsIgnoreCase("manager");
                    break;
                case 6:
                    correctFields[i] = counterRegex.matcher(fields.get(6)).find();
                    break;

            }
            if (!correctFields[i]) correctFields[4] = false;

        }
        return correctFields;
    }

}
