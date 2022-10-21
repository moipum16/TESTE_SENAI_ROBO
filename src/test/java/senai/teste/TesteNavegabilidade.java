package senai.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteNavegabilidade {
	
	ChromeDriver driver;
	
	@Before
	public void preTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://informatica.sp.senai.br/");
	}
	
	@Test
	public void TesteNavegacao() {
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("excell");
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}
	@After
	public void posTeste() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
