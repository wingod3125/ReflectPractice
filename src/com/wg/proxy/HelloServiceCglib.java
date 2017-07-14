package com.wg.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class HelloServiceCglib implements MethodInterceptor{
	private Object target;
	
	//创建代理对象
	public Object getInstance(Object target){
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		//回调方法
		enhancer.setCallback(this);
		//创建代理方法
		return enhancer.create();
	}

	@Override
	//回调方法
	public Object intercept(Object object, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("****************我是CGLIB动态代理*********************");
		Object result = null;
		//反射方法前调用
		System.out.println("我准备说hello");
		result = proxy.invokeSuper(object, args);
		//反射方法后调用
		System.out.println("我说过了hello");
		return result;
	}

}
