package com.d365.testlayer;

import org.testng.annotations.Test;

import com.d365.utils.MasterClass;

public class test extends MasterClass
{

	@Test
	public void add() throws InterruptedException
	{
		login();
	}
}
