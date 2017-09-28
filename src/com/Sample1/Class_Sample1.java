package com.Sample1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class_Sample1 {

	//name
	@Test
	public void method11(){
		
		System.out.println("This is the first method1");
	}

	@Parameters("Param")
	@Test(groups={"regression"})
	public void method12(String param){
		
		System.out.println("This is the 2nd method for regression"+"---->"+ param);
	}

	@Test(groups={"regression","smoke"})
	public void method13(){
		
		System.out.println("This is the 3rd method for Regression & Smoke");
	}

	
	
	@Test(groups={"smoke"})
	public void method14(){
		
		System.out.println("This is the 4th method for smoke");
	}


}
