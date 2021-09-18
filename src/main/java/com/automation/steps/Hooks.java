package com.automation.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.automation.base.DriverInstance.getDriver;
import static com.automation.base.DriverInstance.closeDriver;

public class Hooks {
    //control slash
    @Before
   public void setUp(){
        getDriver(); }

    @After
    public void teardown(){
   closeDriver();
 }
}
