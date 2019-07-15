import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assertion {
@Test
public void user(){
	String At = "anu.fb.com";
	String Et = "anu.fb.com";
	Assert.assertEquals(At,Et);
	System.out.println("Actual is matching with expected title");
	
	boolean Ax = true;
	boolean Ex = true;
	Assert.assertEquals(At,Et);
	System.out.println("Actual is matching with expected title");
	
	Set<String> s = new HashSet<>();
	Collections.addAll(s,"abc","xyz","stu");
	
	Set<String> s2 = new HashSet<>();
	Collections.addAll(s2,"abc","xy","st");
	
	Assert.assertNotEquals(s,s2,"Working");
	
	assert.assertTrue(true);//same for false
	
	SoftAssert sa =  new SoftAssert();
	sa.assertEquals(9,19);
	System.out.println("sfgjjlkk");
	sa.assertAll();
}
}
