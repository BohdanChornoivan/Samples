package com.dan.testregistration.logic;

import com.dan.testregistration.info.Personality;
import com.dan.testregistration.info.User;

public interface AuthUser {

    User singIn(Personality personality);

    User singUp(Personality personality, String name, int age);
}
