package Green.Residency;

import static org.junit.Assert.*;

import org.junit.Test;

import com.green.HelloWorld;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld hello  = new HelloWorld();
		assertEquals("passed", "Hello Santosh", hello.printHello("Santosh"));
	}

}
