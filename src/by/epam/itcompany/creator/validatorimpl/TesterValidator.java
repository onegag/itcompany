package by.epam.itcompany.creator.validatorimpl;

import by.epam.itcompany.entity.type.Position;
import by.epam.itcompany.entity.type.TesterType;

import java.util.List;


public class TesterValidator extends EmployeeValidator {

    @Override
    public boolean[] check(List<String> fields) {
        boolean[] correctFields = new boolean[fields.size()];
        correctFields[4]=true;
        boolean[] returnedFields = new boolean[3];


        for (int i = 4; i < fields.size(); i++) {
            switch (i) {
                case 4:
                    super.check(fields);
                    int a =0;
                    for (boolean b: returnedFields) {
                        correctFields[a++]=b;
                    }
                    break;
                case 5:
                    correctFields[i] = isInEnum(fields.get(i), TesterType.class);
                    break;
                case 6:
                    correctFields[i] = isInEnum(fields.get(i), Position.class);
                    break;

            }
            if (!correctFields[i]) correctFields[4] = false;

        }
        return correctFields;

    }


}


