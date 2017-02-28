package com.cloume.rpc;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcClientProxyCreator;

@Configuration
public class JsonRpcClientConfiguration {

	@Bean
	static public AutoJsonRpcClientProxyCreator autoJsonRpcClientProxyCreator() throws MalformedURLException {
		AutoJsonRpcClientProxyCreator bean = new AutoJsonRpcClientProxyCreator();
		bean.setBaseUrl(new URL("http://localhost:8080"));
		bean.setScanPackage("com.cloume.rpc.service");
		return bean;
	}
}
