package br.com.contmatic.prova.util.validacao;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD, PARAMETER })
@Constraint(validatedBy = DdiValidator.class)
public @interface Ddi {
    
    String message() default "{message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
