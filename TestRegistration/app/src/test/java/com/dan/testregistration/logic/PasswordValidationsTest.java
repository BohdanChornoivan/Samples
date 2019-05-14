package com.dan.testregistration.logic;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class PasswordValidationsTest {

    PasswordValidations passwordValidations = new PasswordValidations();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void passwordInvalidation() {
    }

    @Test(expected = PasswordValidations.LengthException.class)
    public void validate_null_password() {
        assertTrue(passwordValidations.passwordInvalidation(null));
    }
}