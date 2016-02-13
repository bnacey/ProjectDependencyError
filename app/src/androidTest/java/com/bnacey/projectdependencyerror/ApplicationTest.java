package com.bnacey.projectdependencyerror;

import android.app.Application;
import android.test.ApplicationTestCase;

import com.bnacey.lib_a.LibA;
import com.bnacey.lib_b.LibB;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }
}