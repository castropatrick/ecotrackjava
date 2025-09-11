package com.example.ecotrackjava.validation;

import java.util.List;

import com.example.ecotrackjava.model.TipoAtividade;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TipoValidoValidator implements ConstraintValidator<TipoValido, TipoAtividade> {

    private final List<TipoAtividade> validTipos = List.of(
        TipoAtividade.RECICLAGEM,
        TipoAtividade.TRANSPORTE,
        TipoAtividade.ENERGIA
    );

    @Override
    public boolean isValid(TipoAtividade value, ConstraintValidatorContext context) {
        return value == null || validTipos.contains(value);
    }
}
