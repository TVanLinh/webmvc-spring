package model;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by linhtran on 04/05/2017.
 */
@Documented
@Constraint(validatedBy = PersonValid.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsPersonValid {
    String message() default "Please in a gmail such that **@**gmail.com";
    String gmail() default "tranvanlinh@gmail.com";
    Class<?>[] groups() default {};
    Class<?extends Payload> [] payload() default {};
}
