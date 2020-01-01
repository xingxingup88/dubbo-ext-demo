package com.service;

import org.apache.dubbo.common.URL;

public class TestImp2 implements ITestInterface {

	public void dosth1(URL url) {
		System.out.println("impl2 dosth1 called!");
	}

	public void dosth2(URL url) {
		System.out.println("impl2 dosth2 called!");
	}

}
