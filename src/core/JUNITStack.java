package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	
	public void testCreatetoNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size =s1.getSize();
		assertEquals(0, size);  //คาดหวังว่า size จะเป็น 0
		assertTrue(s1.isEmpty());
	}
	
	public void PushElmToTop() {
		
		Stack s2 = new Stack();
		assertFalse(s2.isFuLL());
		s2.push(new Integer(1));		
		int size = s2.getSize();
		assertEquals(1, size);
	}
	
	public void LastInFirstOut() {
		Stack s1 = new Stack();
		int size1 = s1.getSize();
		assertFalse(s1.isFuLL());
		s1.pop();
		int size2 = s1.getSize();
		assertEquals(size1-1, size2);
	}
	
	public void PushElmToLimitedSizeStack() {
		
	}
	
	
	
}
