package com.dan.testregistration.logic;

import org.junit.Before;
import org.junit.Test;

public class AgeValidatorTest {

    AgeValidator ageValidator = new AgeValidator();

    @Before
    public void setUp() throws Exception {
    }

    @Test(expected = AgeValidator.LengthException.class)
    public void ageInvalidation() {
    }
}