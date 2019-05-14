package com.dan.testregistration.logic;

import android.app.admin.SystemUpdatePolicy;
import android.text.TextUtils;

public class PasswordValidations {

    private static final int MIN_PASS_LENGTH = 6;
    private static final int MAX_PASS_LENGTH = 16;

    void passwordInvalidation(String password) throws SystemUpdatePolicy.ValidationFailedException {
        if(TextUtils.isEmpty(password)) throw new ValidationExceptionPass();
        if(password.length() < MIN_PASS_LENGTH) throw new ValidationExceptionPass();
        if(password.length() > MAX_PASS_LENGTH) throw new ValidationExceptionPass();
    }

    class ValidationExceptionPass extends RuntimeException{}
}
