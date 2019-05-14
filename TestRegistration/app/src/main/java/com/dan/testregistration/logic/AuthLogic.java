package com.dan.testregistration.logic;

import com.dan.testregistration.info.Personality;
import com.dan.testregistration.info.User;

public class AuthLogic {

    AuthUser authUser;
    EmailValidations email;
    PasswordValidations password;

    public AuthLogic(AuthUser authUser, EmailValidations email, PasswordValidations password) {
        this.authUser = authUser;
        this.email = email;
        this.password = password;
    }

    User singIn(Personality personality) throws PasswordValidations.ValidationExceptionPass, EmailValidations.ValidationExceptionEmail {
        email.emailInvalidation(personality.getEmail());
        password.passwordInvalidation(personality.getPassword());
        return personality.singIn(personality);
    }

    User singUp(Personality personality, String nickname, int age) {
        return null;
    }
}
