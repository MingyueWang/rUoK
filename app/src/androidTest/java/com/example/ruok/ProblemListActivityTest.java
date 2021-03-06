package com.example.ruok;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;



import com.example.ruok.activities.ProblemListActivity;
import com.example.ruok.activities.ResetPasswordActivity;
import com.example.ruok.activities.SearchActivity;
import com.example.ruok.activities.AddProblemActivity;
import com.robotium.solo.Solo;

import org.junit.Test;

public class ProblemListActivityTest extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    public ProblemListActivityTest() {
        super(ProblemListActivity.class);
    }

    public void setUp() throws Exception{
        solo = new Solo(getInstrumentation(),getActivity());
    }

    public void testStart() throws Exception{
        Activity activity = getActivity();
    }
    @Test
    public void testResetPassword() throws Exception{
        ProblemListActivity activity = (ProblemListActivity) solo.getCurrentActivity();
        solo.assertCurrentActivity("should be ProblemListActivity",ProblemListActivity.class);
        solo.clickOnButton("Reset Password");
        solo.assertCurrentActivity("should be ResetPasswordActivity", ResetPasswordActivity.class);
    }
    public void testSearch() throws Exception{
        ProblemListActivity activity = (ProblemListActivity) solo.getCurrentActivity();
        solo.assertCurrentActivity("should be ProblemListActivity",ProblemListActivity.class);
        solo.clickOnButton("search");
        solo.assertCurrentActivity("should be SearchActivity", SearchActivity.class);
    }
    public void testaddproblem() throws Exception{
        ProblemListActivity activity = (ProblemListActivity) solo.getCurrentActivity();
        solo.assertCurrentActivity("should be ProblemListActivity",ProblemListActivity.class);
        solo.clickOnButton("add a problem");
        solo.assertCurrentActivity("should be AddProblemActivity", AddProblemActivity.class);
    }
    
    

}
