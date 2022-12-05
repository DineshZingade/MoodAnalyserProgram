package com.bridgelabz;
//TC1.1ReturnSAD

import junit.framework.Assert;
import junit.framework.TestCase;

public class MoodAnaliserTest extends TestCase {
	  public void testAnalyseMood() {
	        MoodAnaliserMain moodAnalyser = new MoodAnaliserMain();
	        moodAnalyser.setMessage("I am in Sad Mood");
	        String actualResult = moodAnalyser.analyseMood();
	        Assert.assertEquals("SAD", actualResult);
	    }

}
