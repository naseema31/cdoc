package junit;

import org.junit.Test;

public class Mobile_invalid{

	
@Test
public void invalid(){
	Mobile mob=new Mobile();
	
	mob.setNumber("998877654");
	String mobile = mob.getNumber();
	if(mob.getNumber().length()<10) {
		System.out.println("Error Not Valid Number");
}
}
}