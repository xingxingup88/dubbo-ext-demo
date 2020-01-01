package com.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;
@SPI("imp2")
public interface ITestInterface {
	@Adaptive({"key1","key2"})
	void dosth1(URL url);
	@Adaptive({"key2","key1"})
	void dosth2(URL url);
	@Adaptive
	default void doDefault(URL url)
	{
		System.out.println("doDefault called!");
	}
}
