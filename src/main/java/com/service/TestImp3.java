package com.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;
@Activate(group = "g1", order = 1)
public class TestImp3 implements ITestInterface {

	public void dosth1(URL url) {
		System.out.println("impl3 dosth1 called!");
	}

	public void dosth2(URL url) {
		System.out.println("impl3 dosth2 called!");
	}

}
