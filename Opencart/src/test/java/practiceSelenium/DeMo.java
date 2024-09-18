package practiceSelenium;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeMo {
		
	@Test
	 void windowHandles() {

		WebDriver driver = new ChromeDriver();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String win : windowHandles) 
		{
			String tittles = driver.switchTo().window(win).getTitle();
			
			if (tittles.equals(" ")) 
			{
				driver.switchTo().window(" ");
			}
		}
		
	
		
		
		
		
	}

}
