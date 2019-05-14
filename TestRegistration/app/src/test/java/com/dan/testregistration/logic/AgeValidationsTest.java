package com.dan.testregistration.logic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgeValidationsTest {

    AgeValidations ageValidations = new AgeValidations();

    @Before
    public void setUp() throws Exception {
    }

    @Test(expected = AgeValidations.LengthException.class)
    public void ageInvalidation() {
    }
}