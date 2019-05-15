package com.dan.testregistration.logic;

import android.app.admin.SystemUpdatePolicy;
import android.text.TextUtils;

public class AgeValidator {

    private static final int MIN_AGE_LENGTH = 15;
    private static final int MAX_AGE_LENGTH = 200;

    void ageInvalidation(String password) throws SystemUpdatePolicy.ValidationFailedException {
        if(TextUtils.isEmpty(password)) throw new ValidationExceptionAge();
        if(password.length() < MIN_AGE_LENGTH) throw new ValidationExceptionAge();
        if(password.length() > MAX_AGE_LENGTH) throw new ValidationExceptionAge();
    }

    class ValidationExceptionAge extends RuntimeException{}
    class LengthException extends Exception{}
}
