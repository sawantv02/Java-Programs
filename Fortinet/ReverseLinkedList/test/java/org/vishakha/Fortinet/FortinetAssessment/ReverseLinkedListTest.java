package org.vishakha.Fortinet.FortinetAssessment;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;

/**
 * Unit test for simple App.
 */
public class ReverseLinkedListTest {
	private void testReverse(Node test, String testmsg,Object expected) {
		Node reverseTest = ReverseLinkedList.getInstance();
		try {
			Node result=reverseTest.reverseList(test);
			assertTrue(testmsg,result==expected);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@org.junit.Test
	public void test1() {
		String testmsg = "Test1:If null node is passed";
		String expected="";
		Node n1=null;
		testReverse(n1, testmsg,null);
	}

	@org.junit.Test
	public void test2() {
		String testmsg = "Test2:If only one node is passed";
		Node n1=new Node();
		n1.value=10;
		testReverse(n1, testmsg, n1);
	}
}
