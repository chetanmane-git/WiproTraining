package Aug_16;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithForLoop_NopCom {
	@DataProvider(name = "loginData")
	public Object[][] getData() {
		int size = 2;
		Object[][] data = new Object[size][2];
		
		for(int i=0; i<size; i++) {
			data[i][0] = "admin"+i;
			data[i][1] = "admin123"+i;			
		}
		return data;
	}
	
	@Test(dataProvider = "loginData")
	public void logiTest(String username, String password) {
		System.out.println("Running test with: " + username + " | " + password);
	}
}
