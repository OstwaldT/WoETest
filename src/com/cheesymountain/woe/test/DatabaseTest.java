package com.cheesymountain.woe.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import android.test.ActivityUnitTestCase;
import com.cheesymountain.woe.Database;
import com.cheesymountain.woe.Everbie;

public class DatabaseTest extends ActivityUnitTestCase<Database> {
	
	Database database;
	
	public DatabaseTest(Class<Database> database) {
		super(database);
		this.database = new Database();
	}
	private Everbie everbie;
	
	@Override
	public void setUp() throws Exception {
		super.setUp();
		everbie = Everbie.getEverbie();
		everbie.reset();
	}
	public void preTestConditions(){
		assertTrue(everbie.isAlive());
		assertTrue(!everbie.isAlive());
	}
	public void saveAndLoadTest() throws FileNotFoundException, IOException{
		everbie.changeHealth(20);
		everbie.changeToxicity(24);
		database.save();
		database.load();
	}
}