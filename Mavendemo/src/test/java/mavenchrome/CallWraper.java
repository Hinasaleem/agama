package mavenchrome;

 import java.io.IOException;

public class CallWraper {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WrapperMethod wm = new WrapperMethod();
		wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		wm.enterbyid("txtUsername", "Admin");
		wm.enterbyid("txtPassword", "admin123");
		wm.clickbyxpath("//*[@id=\"btnLogin\"]");
		wm.clickbyxpath("//*[@id=\"menu_pim_viewPimModule\"]/b");
		wm.clickbyxpath("//*[@id=\'btnAdd\']");
		Thread.sleep(1000);
		System.out.println("after");
		//wm.enterbyid("firstName", "John");
		wm.enterbyid("firstName", "Hina");
		
		wm.enterbyid("middleName", "S");
		wm.enterbyid("lastName", "Tad");
		System.out.println("after1111");
		wm.Fileupload("photofile", "C:\\Users\\rwalt\\OneDrive\\Desktop\\QA_Agama\\screenshots\\robox.png");
		wm.clickbyxpath("//*[@id=\'btnSave\']");
		Thread.sleep(1000);
		wm.takesnap("C:\\Users\\rwalt\\OneDrive\\Desktop\\QA_Agama\\screenshots\\orange5.png");

	}
}
