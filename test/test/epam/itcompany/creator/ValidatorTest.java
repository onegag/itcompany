package test.epam.itcompany.creator;



import by.epam.itcompany.creator.validatorimpl.DeveloperValidator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidatorTest {
    private  List<String> fields;
    @BeforeClass
    public void beforeClass() {
        String[] s = {"Bill", "Gates", "100_000", "25/12/1972", "Developer", "Java", "Lead"};
        fields = new ArrayList<>();
        fields.addAll(Arrays.asList(s));
    }
    @Test
    public void developerValidatorTest(){
        DeveloperValidator developerValidator = new DeveloperValidator();
        boolean []b=developerValidator.check(fields);


        Assert.assertTrue(developerValidator.check(fields)[4]);


    }


}
