package com.example.springbootmaskingdemo.utility;

public class CommonUtil {

	public static String getMaskedPan(String pan) {
		pan = pan.replaceAll(pan, "*******");
		return pan;
	}

}
