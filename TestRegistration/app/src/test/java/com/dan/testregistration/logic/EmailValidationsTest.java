package com.dan.testregistration.logic;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class EmailValidationsTest {

    EmailValidations emailValidations = new EmailValidations();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void emailInvalidation() {
    }

    @Test(expected =  EmailValidations.LengthException.class)
    public void isValidEmail() {
    }
}