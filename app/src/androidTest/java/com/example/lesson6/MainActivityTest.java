package com.example.lesson6;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    // Addition
    @Test
    public void checkAddCase() {
        onView(withId(R.id.et_num1)).perform(typeText("3"));
        onView(withId(R.id.et_num2)).perform(typeText("7"));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("10")));
    }

    @Test
    public void checkAddEmptyFieldCase() {
        onView(withId(R.id.et_num2)).perform(typeText(""));
        onView(withId(R.id.et_num1)).perform(typeText(""));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("")));
    }

    @Test
    public void checkAddWordsCase() {
        onView(withId(R.id.et_num1)).perform(typeText("ad"));
        onView(withId(R.id.et_num2)).perform(typeText("gfag"));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("")));
    }

    @Test
    public void checkAddSpaceCase() {
        onView(withId(R.id.et_num1)).perform(typeText(" 3"));
        onView(withId(R.id.et_num2)).perform(typeText("3 "));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("6")));
    }

    @Test
    public void checkAddDoubleCase() {
        onView(withId(R.id.et_num1)).perform(typeText("2.4"));
        onView(withId(R.id.et_num2)).perform(typeText("4.5"));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("6.9")));
    }

    //Subtraction
    @Test
    public void checkSubCase() {
        onView(withId(R.id.et_num1)).perform(typeText("10"));
        onView(withId(R.id.et_num2)).perform(typeText("5"));
        onView(withId(R.id.btn_sub)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("5")));
    }

    @Test
    public void checkSubEmptyFieldCase() {
        onView(withId(R.id.et_num2)).perform(typeText(""));
        onView(withId(R.id.et_num1)).perform(typeText(""));
        onView(withId(R.id.btn_sub)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("")));
    }

    @Test
    public void checkSubWordsCase() {
        onView(withId(R.id.et_num1)).perform(typeText("ad"));
        onView(withId(R.id.et_num2)).perform(typeText("gfag"));
        onView(withId(R.id.btn_sub)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("")));
    }

    @Test
    public void checkSubSpaceCase() {
        onView(withId(R.id.et_num1)).perform(typeText(" 6"));
        onView(withId(R.id.et_num2)).perform(typeText("2 "));
        onView(withId(R.id.btn_sub)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("4")));
    }

    @Test
    public void checkSubDoubleCase() {
        onView(withId(R.id.et_num1)).perform(typeText("9.3"));
        onView(withId(R.id.et_num2)).perform(typeText("3.2"));
        onView(withId(R.id.btn_sub)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("6.1")));
    }

    //Multiplication
    @Test
    public void checkMulCase() {
        onView(withId(R.id.et_num1)).perform(typeText("10"));
        onView(withId(R.id.et_num2)).perform(typeText("5"));
        onView(withId(R.id.btn_mul)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("50")));
    }

    @Test
    public void checkMulEmptyFieldCase() {
        onView(withId(R.id.et_num2)).perform(typeText(""));
        onView(withId(R.id.et_num1)).perform(typeText(""));
        onView(withId(R.id.btn_mul)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("")));
    }

    @Test
    public void checkMulWordsCase() {
        onView(withId(R.id.et_num1)).perform(typeText("ad"));
        onView(withId(R.id.et_num2)).perform(typeText("gfag"));
        onView(withId(R.id.btn_mul)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("")));
    }

    @Test
    public void checkMulSpaceCase() {
        onView(withId(R.id.et_num1)).perform(typeText(" 6"));
        onView(withId(R.id.et_num2)).perform(typeText("2 "));
        onView(withId(R.id.btn_mul)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("12")));
    }

    @Test
    public void checkMulDoubleCase() {
        onView(withId(R.id.et_num1)).perform(typeText("9.3"));
        onView(withId(R.id.et_num2)).perform(typeText("3.2"));
        onView(withId(R.id.btn_mul)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("29.76")));
    }

    //Division
    @Test
    public void checkDivCase() {
        onView(withId(R.id.et_num1)).perform(typeText("10"));
        onView(withId(R.id.et_num2)).perform(typeText("5"));
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("2")));
    }

    @Test
    public void checkDivEmptyFieldCase() {
        onView(withId(R.id.et_num2)).perform(typeText(""));
        onView(withId(R.id.et_num1)).perform(typeText(""));
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("")));
    }

    @Test
    public void checkDivWordsCase() {
        onView(withId(R.id.et_num1)).perform(typeText("ad"));
        onView(withId(R.id.et_num2)).perform(typeText("gfag"));
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("")));
    }

    @Test
    public void checkDivSpaceCase() {
        onView(withId(R.id.et_num1)).perform(typeText(" 20"));
        onView(withId(R.id.et_num2)).perform(typeText("4 "));
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("5")));
    }

    @Test
    public void checkDivDoubleCase() {
        onView(withId(R.id.et_num1)).perform(typeText("9.6"));
        onView(withId(R.id.et_num2)).perform(typeText("3.2"));
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("3.0")));
    }
}
