package com.unit1;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class JunitParameter {
	Addition a1=null;
	int f_no,s_no,e_no;
	
	
	
	@Before
public void before() {
	a1=new Addition();
	
}
	public JunitParameter(int f_no,int s_no,int e_no) {
		// TODO Auto-generated constructor stub
		this.f_no=f_no;
		this.s_no=s_no;
		this.e_no=e_no;
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{1,2,3},{4,5,9},{10,11,31}});
	}
	
	@Test
	public void test() {
		System.out.println("my expeceted no is..."+e_no);
		Assert.assertEquals(e_no,a1.sum(f_no, s_no));
	}
}
