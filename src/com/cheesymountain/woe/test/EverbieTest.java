package com.cheesymountain.woe.test;

import android.test.ActivityInstrumentationTestCase2;
import com.cheesymountain.woe.*;

public class EverbieTest extends ActivityInstrumentationTestCase2<MainActivity> {
	
	//private MainActivity mActivity;
	private Everbie mEverbie; 
	
	public EverbieTest(Class<MainActivity> activityClass) {
		super(activityClass);
		
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		setActivityInitialTouchMode(false);
		//mActivity = getActivity();
		mEverbie = Everbie.getEverbie();
	}
	
	public void testPreConditions(){
		assertTrue(mEverbie != null);
		assertTrue(mEverbie.GetName() == Everbie.DEFAULT_NAME);
	}
	// GnC = Getters and Changers
	public void testGnCForHealth(){
		int maxHealth = mEverbie.getMaxHealth();
		assertTrue(mEverbie.getHealth()==1);
		mEverbie.changeHealth(48);
		assertTrue(mEverbie.getHealth()==49);
		mEverbie.changeHealth(maxHealth);
		assertTrue(mEverbie.getHealth()==maxHealth);
		mEverbie.changeHealth(-78);
		assertTrue(mEverbie.getHealth()==(maxHealth-78));
		mEverbie.changeHealth(-maxHealth);
		assertTrue(mEverbie.getHealth()==0);
		assertTrue(mEverbie.isAlive()==false);
	}
	public void testGnCForFullness(){
		assertTrue(mEverbie.getFullness()==50);
		mEverbie.changeFullness(34);
		assertTrue(mEverbie.getFullness()==84);
		mEverbie.changeFullness(-40);
		assertTrue(mEverbie.getFullness()==44);
		mEverbie.changeFullness(100);
		assertTrue(mEverbie.getFullness()==100);
		mEverbie.changeFullness(-150);
		assertTrue(mEverbie.getFullness()==0);
	}
	public void testGnCForHappiness(){
		assertTrue(mEverbie.getHappiness()==50);
		mEverbie.changeHappiness(34);
		assertTrue(mEverbie.getHappiness()==84);
		mEverbie.changeHappiness(-40);
		assertTrue(mEverbie.getHappiness()==44);
		mEverbie.changeHappiness(100);
		assertTrue(mEverbie.getHappiness()==100);
		mEverbie.changeHappiness(-150);
		assertTrue(mEverbie.getHappiness()==0);
	}
	public void testGnCForToxicity(){
		assertTrue(mEverbie.getHappiness()==0);
		mEverbie.changeHappiness(67);
		assertTrue(mEverbie.getHappiness()==67);
		mEverbie.changeHappiness(-40);
		assertTrue(mEverbie.getHappiness()==27);
		mEverbie.changeHappiness(-100);
		assertTrue(mEverbie.getHappiness()==0);
		mEverbie.changeHappiness(150);
		assertTrue(mEverbie.getHappiness()==100);
		assertTrue(mEverbie.isAlive()==false);
	}
	public void testGnCForStrength(){
		assertTrue(mEverbie.getStrength()==1);
		mEverbie.changeStrength(4);
		assertTrue(mEverbie.getStrength()==5);
		mEverbie.changeStrength(-2);
		assertTrue(mEverbie.getStrength()==3);
		mEverbie.changeStrength(-5);
		assertTrue(mEverbie.getStrength()==0);
		assertTrue(mEverbie.isAlive()==false);
	}
	public void testGnCForStamina(){
		assertTrue(mEverbie.getStamina()==1);
		mEverbie.changeStamina(4);
		assertTrue(mEverbie.getStamina()==5);
		mEverbie.changeStamina(-2);
		assertTrue(mEverbie.getStamina()==3);
		mEverbie.changeStamina(-5);
		assertTrue(mEverbie.getStamina()==0);
		assertTrue(mEverbie.isAlive()==false);
	}
	public void testGnCForIntelligence(){
		assertTrue(mEverbie.getIntelligence()==1);
		mEverbie.changeIntelligence(4);
		assertTrue(mEverbie.getIntelligence()==5);
		mEverbie.changeIntelligence(-2);
		assertTrue(mEverbie.getIntelligence()==3);
		mEverbie.changeIntelligence(-5);
		assertTrue(mEverbie.getIntelligence()==0);
		assertTrue(mEverbie.isAlive()==false);
	}
	public void testGnCForCharm(){
		assertTrue(mEverbie.getCharm()==1);
		mEverbie.changeCharm(8);
		assertTrue(mEverbie.getCharm()==9);
		mEverbie.changeCharm(-4);
		assertTrue(mEverbie.getCharm()==5);
		mEverbie.changeCharm(-7);
		assertTrue(mEverbie.getCharm()==-2);
		mEverbie.changeCharm(3);
		assertTrue(mEverbie.getCharm()==1);
	}
	public void testGnCForCuteness(){
		assertTrue(mEverbie.getCuteness()==1);
		mEverbie.changeCuteness(8);
		assertTrue(mEverbie.getCuteness()==9);
		mEverbie.changeCuteness(-4);
		assertTrue(mEverbie.getCuteness()==5);
		mEverbie.changeCuteness(-7);
		assertTrue(mEverbie.getCuteness()==-2);
		mEverbie.changeCuteness(3);
		assertTrue(mEverbie.getCuteness()==1);
	}
	public void testGnCForMoney(){
		int stMon = Everbie.STARTING_MONEY;
		assertTrue(mEverbie.getMoney()==stMon);
		mEverbie.changeMoney(40);
		assertTrue(mEverbie.getMoney()==(stMon+40));
		mEverbie.changeMoney(-68);
		assertTrue(mEverbie.getMoney()==stMon-28);
		mEverbie.changeMoney(-stMon);
		assertTrue(mEverbie.getMoney()==stMon-28);
	}

}
