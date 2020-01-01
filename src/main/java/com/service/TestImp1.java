package com.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;
@Activate(group = "g1",order = 4)
public class TestImp1 implements ITestInterface {

	public void dosth1(URL url) {
		System.out.println("impl1 dosth1 called!");
	}

	public void dosth2(URL url) {
		System.out.println("impl1 dosth2 called!");
	}
}
