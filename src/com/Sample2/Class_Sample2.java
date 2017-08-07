package com.Sample2;

import org.testng.annotations.Test;

public class Class_Sample2 {
	
	
	@Test
	public void method21(){
		
		System.out.println("This is the first method1");
	}

	
	@Test(groups={"smoke"})
	public void method22(){
		
		System.out.println("This is the first method for Smoke");
	}

	
	@Test(groups={"regression"})
	public void method23(){
		
		System.out.println("This is the first method for Regression");
	}

	@Test(groups={"regression","smoke"})
	public void method24(){
		
		System.out.println("This is the first method for Regression & Smoke");
	}

}
