package com.dan.testregistration.logic;

import android.text.TextUtils;

public class EmailValidations {

    private static final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    public final static boolean emailInvalidation(String email) {

        if (email.matches(emailPattern)) {
            return true;
        } else {
            return false;
        }
    }

    public final static boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

    class ValidationExceptionEmail extends RuntimeException{}
}
