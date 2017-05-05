package model;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by linhtran on 04/05/2017.
 */
public class PersonValid  implements ConstraintValidator<IsPersonValid,String>{
    public void initialize(IsPersonValid isPersonValid) {
        System.out.println(isPersonValid.gmail());
    }

    public boolean isValid(String gmail, ConstraintValidatorContext constraintValidatorContext) {
        if(gmail==null)
        {
            return false;
        }
        if(gmail.trim().indexOf("@")<3||gmail.trim().indexOf(".com")<6)
        {
            return false;
        }
        return true;
    }
}
