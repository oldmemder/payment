package ru.sbrf.payment.ibfront.inputs;

import java.util.regex.Pattern;

public class PaymentCurrency extends Inputs{

    public PaymentCurrency(String InputString) {
        super(InputString);
    }

    @Override
    public boolean validation() {
        return Pattern.matches("\\d{3}",super.getInputString());
    }

    @Override
    public Integer conversion() {
        return Integer.parseInt(super.getInputString());
    }

}