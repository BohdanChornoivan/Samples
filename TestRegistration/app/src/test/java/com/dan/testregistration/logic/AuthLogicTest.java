package com.dan.testregistration.logic;

import com.dan.testregistration.info.Personality;
import com.dan.testregistration.info.User;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AuthLogicTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    AuthUser authUser;

    @Mock
    PasswordValidations validations;

    @InjectMocks
    AuthLogic authLogic;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        Mockito.when(validations.passwordInvalidation("correct_password")).thenReturn(true);
        Mockito.when(validations.passwordInvalidation("incorrect_password")).thenReturn(false);

    }

    @Test
    public void singIn() {
        User toAuth = new User();

        Personality personality = new Personality();
        personality.setPassword("incorrect_password");
        personality.setPassword("human@mail.ru");

        Mockito.when(authUser.signIn(personality)).thenReturn(toAuth);

        assertNull(authLogic.signIn(personality));
        personality.setPassword("correct_password");
        User signedUser = authLogic.signIn(personality);
        assertEquals(signedUser, toAuth);
    }

    @Test
    public void singUp() {
    }
}