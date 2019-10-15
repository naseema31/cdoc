package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Mobile_test {

	

@Test
public void test_Mobile()

{
Mobile mob=new Mobile();
//mob.setId();
mob.setNumber("9988776547");
String mobile = mob.getNumber();
if(mob.getNumber().length()==10) {
	
	System.out.println(mobile);

}

}

}

