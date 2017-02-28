package com.cloume.rpc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cloume.rpc.service.TechTalkService2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TtRpcClientApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testRpc() {
		Assert.assertNotNull(techTalkService2);
		
		String helloTo = techTalkService2.sayHelloTo("xfzhao");
		Assert.assertEquals("hello! xfzhao", helloTo);
	}

	@Autowired TechTalkService2 techTalkService2;
}
