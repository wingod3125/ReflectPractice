package com.wg.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectService {

	public void sayHello(String name){
		System.out.println("hello "+name);
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		//通过反射建立ReflectService对象
		Object service = Class.forName(ReflectService.class.getName()).newInstance();
		//获取服务方法 sayHello
		Method method = service.getClass().getMethod("sayHello", String.class);
		//反射调用方法
		method.invoke(service, "zhangsan");
	}
	
}
