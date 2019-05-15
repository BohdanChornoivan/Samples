package com.dan.testregistration.logic;

import com.dan.testregistration.info.Personality;
import com.dan.testregistration.info.User;

public class AuthLogic {

    AuthUser authUser;
    EmailValidator email;
    PasswordValidator password;

    public AuthLogic(AuthUser authUser, EmailValidator email, PasswordValidator password) {
        this.authUser = authUser;
        this.email = email;
        this.password = password;
    }

    User signIn(Personality personality) throws PasswordValidator.ValidationExceptionPass, EmailValidator.EmailException {
        email.validate(personality.getEmail());
        password.passwordInvalidation(personality.getPassword());
        return personality.signIn(personality);
    }

    User signUp(Personality personality, String nickname, int age) {
        return null;
    }
}
