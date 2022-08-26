	package day17;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Demo2 {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///D:/Demo9.html");

			List<WebElement> e2 = driver.findElements(By.tagName("input"));
			int count = e2.size();
			System.out.println(count);//2
			 
			WebElement textbox0 = e2.get(0);//get the 1st 
			textbox0.sendKeys("Bhanu");
			 
			WebElement textbox1 = e2.get(1);//get the 2nd 
			textbox1.sendKeys("Prakash");
			 
			 WebElement textbox2 = e2.get(2);//get the 3rd-- IndexOutOfBoundsException
			 textbox2.sendKeys("HK");
			 
			 

}}
