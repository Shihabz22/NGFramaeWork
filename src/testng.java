import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testng {
	
	@Test
	
	public void NG()
	{
		
System.out.println("test");
	}

	
	
@Test

public void ng2()

{
	
	System.out.println("test2");
	
}

@Parameters({"url"})

	@Test

	public void ng3(String urlname)

	{
		
		System.out.println("test3");
		System.out.println("urlname");
		
}
	
	
	
	@Test

	public void ng4()

	{
		
		System.out.println("test4");
		
}
}