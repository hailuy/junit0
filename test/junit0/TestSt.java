package junit0;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

//import st.test;

public class TestSt {

	@Test
	public void testFoo(){
		assertEquals(st.test(0,0,0),"This is not a Triangle");
		assertEquals(st.test(3,4,5),"This is a scalene Triangle");
		assertEquals(st.test(3,3,4),"This is a isosceles Triangle");
		assertEquals(st.test(3,3,3),"This is a equilateral Triangle");
		System.out.println("Ok");
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
