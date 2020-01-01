package com.service;

import org.apache.dubbo.common.URL;

public class Wrapper1 implements ITestInterface {
	ITestInterface target;
	public Wrapper1(ITestInterface delegate)
	{
		target = delegate;
	}
	
	@Override
	public void dosth1(URL url) {
		System.out.println("call from wrapper1");
		target.dosth1(url);
	}

	@Override
	public void dosth2(URL url) {
		System.out.println("call from wrapper1");
		target.dosth2(url);
	}

}
