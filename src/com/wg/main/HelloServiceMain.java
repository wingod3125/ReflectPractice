package com.wg.main;

import com.wg.proxy.HelloServiceProxy;
import com.wg.service.HelloService;
import com.wg.service.impl.HelloServiceImpl;

public class HelloServiceMain {
	public static void main(String[] args) {
		HelloServiceProxy helloHandler = new HelloServiceProxy();
		HelloService proxy = (HelloService) helloHandler.bind(new HelloServiceImpl());
		proxy.sayHello("zhangsan");
	}
}
