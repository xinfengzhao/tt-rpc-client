package com.cloume.rpc.service;

import com.googlecode.jsonrpc4j.JsonRpcService;

@JsonRpcService("/techTalkService.json")
public interface TechTalkService2 {
	String sayHelloTo(String name);
}
