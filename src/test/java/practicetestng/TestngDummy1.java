package practicetestng;
import org.testng.annotations.Test;
public class TestngDummy1 {
//way 1 run as java application
	
	public static void main(String[] args) {
   System.out.println("Hi, Im Main Method");
	}
// way 2 run as TestNG Test
	@Test
	public void method()
	{
		System.out.println("Hi, Im an annotated method");
	}
}
