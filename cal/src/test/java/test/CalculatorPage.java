package test;

import org.testng.annotations.Test;

import cal.ganaric.BaseClass;
import Page.Calculator;;


public class CalculatorPage extends BaseClass{

	@Test
	public void calculation() throws InterruptedException
	{
		Calculator cl=new Calculator(driver);
		
		// multiplication
		cl.ac();
	    cl.input(423);
		cl.mul();
		cl.input(525);
		cl.output();
		 
		// add
		cl.ac();
		 cl.sub();
		 cl.input(234234);
			cl.add();
			cl.input(345345);
			cl.output();
		
		// sub
            cl.ac();
			cl.input(234823);
			cl.sub();
			cl.sub();
			cl.input(23094823);
			cl.output();
		// div
	        cl.ac();
			cl.input(4000);
			cl.div();
			cl.input(200);
			cl.output();
	
		
		
		}
	
	
	
}	
