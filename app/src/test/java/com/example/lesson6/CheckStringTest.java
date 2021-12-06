package com.example.lesson6;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CheckStringTest {

    CheckString checkString;

    @Before
    public void setUp() {
        Context context = Mockito.mock(Context.class);
        checkString = new CheckString(context);
    }

    @Test
    public void checkUrlTest() {

    }

}
