package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Calculator {

	 String s1;

	@FindBy(id = "//div[@id='sciInPut']")
	private WebElement in;
	
	@FindBy(xpath = "//div[@id='sciOutPut']")
	private WebElement out;
	
	@FindBy(xpath = "//span[text()='+']")
    private WebElement add;
	
	@FindBy(xpath = "//span[text()='–']")
	private WebElement sub ;
	
	@FindBy(xpath = "//span[text()='/']")
	private WebElement div ;
	
	@FindBy(xpath = "//span[text()='×']")
	private WebElement mul ;

	@FindBy(xpath = "//span[text()='AC']")
	private WebElement ac ;
	
	@FindBy(xpath = "//span[text()='0']")
	private WebElement a0 ;
	
	
	@FindBy(xpath = "//span[text()='1']")
	private WebElement a1 ;
	
	@FindBy(xpath = "//span[text()='2']")
	private WebElement a2 ;
	
	@FindBy(xpath = "//span[text()='3']")
	private WebElement a3 ;
	
	@FindBy(xpath = "//span[text()='4']")
	private WebElement a4 ;
	
	@FindBy(xpath = "//span[text()='5']")
	private WebElement a5 ;
	
	@FindBy(xpath = "//span[text()='6']")
	private WebElement a6 ;
	
	@FindBy(xpath = "//span[text()='7']")
	private WebElement a7 ;
	
	@FindBy(xpath = "//span[text()='8']")
	private WebElement a8 ;
	
	@FindBy(xpath = "//span[text()='9']")
	private WebElement a9 ;
	
	

	
	
	
	public Calculator(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void input(int n1)
	{
		String obj = String.valueOf(n1);
	
		
		for(int i=0; i<obj.length() ;i++)
		{
		
		char ch = obj.charAt(i) ;
		
		if(ch=='0')
		{
			a0.click();
		}
		
		if(ch=='1')
		{
			a1.click();
		}
		if(ch=='2')
		{
			a2.click();
		}
		
		if(ch=='3')
		{
			a3.click();
		}
		
		if(ch=='4')
		{
			a4.click();
		}

		if(ch=='5')
		{
			a5.click();
		}

		if(ch=='6')
		{
			a6.click();
		}

		if(ch=='7')
		{
			a7.click();
		}

		if(ch=='8')
		{
			a8.click();
		}

		if(ch=='9')
		{
			a9.click();
		}

		}
		System.out.println(n1);
		
	}
	
	public void output()throws InterruptedException{
		
		System.out.println("output="+out.getText());
		Thread.sleep(3000);	
	}
	
	public void add()
	{
		add.click();
		System.out.println("+");
	}
		
	public void sub()
	{
		sub.click();
		System.out.println("-");
	}
	
	public void mul()
	{
		mul.click();
		System.out.println("x");
	}
	
	public void div()
	{
		div.click();
		System.out.println("/");
	}
	
	public void ac()
	{
		ac.click();
	}
}
