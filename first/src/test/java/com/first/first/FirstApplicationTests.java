package com.first.first;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstApplicationTests {

	@Test
	public void contextLoads() {
		
	}
	@Autowired
	public Example Ex;
	
	@Test
	public void unitTest()
	{
		String str=Ex.home();
		assertEquals(str,"Hello World!");
	}
}
