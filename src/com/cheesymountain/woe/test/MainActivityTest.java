package com.cheesymountain.woe.test;

import android.test.ActivityInstrumentationTestCase2;

import com.cheesymountain.woe.MainActivity;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
	
	public MainActivityTest(String name) {
		super(MainActivity.class);
		setName(name);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		setActivityInitialTouchMode(false);
	}
}
