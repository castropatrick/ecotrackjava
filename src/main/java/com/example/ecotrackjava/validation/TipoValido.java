package com.example.ecotrackjava.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TipoValidoValidator.class)
public @interface TipoValido {
    String message() default "{atividade.tipo.invalido}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
