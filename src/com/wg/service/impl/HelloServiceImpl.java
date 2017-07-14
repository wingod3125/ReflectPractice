package com.wg.service.impl;

import com.wg.service.HelloService;

public class HelloServiceImpl implements HelloService{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name);
	}

}
