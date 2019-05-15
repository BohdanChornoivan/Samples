package com.dan.testregistration.logic;

import com.dan.testregistration.info.Personality;
import com.dan.testregistration.info.User;

public interface AuthUser {

    User signIn(Personality personality);

    User signUp(Personality personality, String name, int age);
}
