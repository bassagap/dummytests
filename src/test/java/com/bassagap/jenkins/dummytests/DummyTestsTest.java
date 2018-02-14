package com.bassagap.jenkins.dummytests;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTestsTest {
    @Test
    public void assertFalsePass() throws Exception {
        Assert.assertFalse(false);
    }
    @Test
    public void assertFalseFail() throws Exception {
        Assert.assertFalse(true);
    }
}