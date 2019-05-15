package com.dan.testregistration.logic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.rules.ExpectedException;

public class EmailValidatorTest {

    private EmailValidator emailValidator;

    @BeforeClass
    public void initData() {
        emailValidator = new EmailValidator();
    }


    @Test(expected = EmailValidator.EmailException.class)
    public void ValidEmailTest(String[] Email) {

        for (String temp : Email) {
            boolean valid = emailValidator.validate(temp);
            System.out.println("Email: " + temp + " -> " + valid);
            Assert.assertEquals(valid, true);
        }

    }

    @Test(expected = EmailValidator.EmailException.class)
    public void InValidEmailTest(String[] Email) {

        for (String temp : Email) {
            boolean valid = emailValidator.validate(temp);
            System.out.println("Email: " + temp + " -> " + valid);
            Assert.assertEquals(valid, false);
        }
    }
}