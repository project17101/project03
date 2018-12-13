package com.demo.until;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class checkUtils {
	
	/**
	 * 验证邮箱格式 去重
	 * 
	 * @param emailStr
	 */
	public static Map<String, Object> checkEmail(String emailStr) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		emailStr = emailStr.replaceAll("\r\n", "");// 去除空格回车
		emailStr = emailStr.replaceAll(" ", "");// 去除空格回车
		String[] lm = emailStr.split(",");// 定义数组

		List list = new ArrayList();// new一个arralist
		Set set = new HashSet();// new 一个hashset
		set.addAll(Arrays.asList(lm));// 将数组转为list并存入set中，就可以去掉重复项了
		for (Iterator it = set.iterator(); it.hasNext();) {
			list.add(it.next());// 遍历set 将所有元素键入list中
		}
		String noRepeatList = list.toString();
		noRepeatList = noRepeatList.replace("[", "");
		noRepeatList = noRepeatList.replace("]", "");
		noRepeatList = noRepeatList.replace(" ", "");
		noRepeatList = noRepeatList.trim();

		boolean flag = true;
		String errorMessage = "";
		String[] lms = noRepeatList.split(",");
		if (lms.length > 0) {
			for (int i = 0; i < lms.length; i++) {
				if (!lms[i].trim().matches("^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$")) {
					flag = false;
					errorMessage = lms[i] + "格式有误";
					break;
				}
			}
		}
		returnMap.put("flag", flag);
		returnMap.put("returnList", noRepeatList);
		returnMap.put("errorMessage", errorMessage);
		return returnMap;
	}
	
	/**
	 * 验证手机格式 去掉重复的方法
	 * 
	 * @param mobileArr
	 *            字符串
	 */
	public static Map<String, Object> checkMobile(String mobileArr) {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		mobileArr = mobileArr.replaceAll("\r\n", "");// 去除空格回车
		mobileArr = mobileArr.replaceAll(" ", "");// 去除空格回车
		String[] lm = mobileArr.split(",");// 定义数组
		List list = new ArrayList();// new一个arralist
		Set set = new HashSet();// new 一个hashset
		set.addAll(Arrays.asList(lm));// 将数组转为list并存入set中，就可以去掉重复项了
		for (Iterator it = set.iterator(); it.hasNext();) {
			list.add(it.next());// 遍历set 将所有元素键入list中
		}
		String noRepeatList = list.toString();
		noRepeatList = noRepeatList.replace("[", "");
		noRepeatList = noRepeatList.replace("]", "");
		noRepeatList = noRepeatList.replace(" ", "");
		noRepeatList = noRepeatList.trim();

		String flag = "true";
		String errorMobile = "";
		String[] lms = noRepeatList.split(",");
		if (lms.length > 0) {
			for (int i = 0; i < lms.length; i++) {
				if (!lms[i].trim().matches("^1[0-9]{10}$")) {
					flag = "false";
					errorMobile = lms[i] + "格式有误";
					break;
				}
			}
		}
		returnMap.put("flag", flag);
		returnMap.put("mobileList", noRepeatList);
		returnMap.put("errorMobile", errorMobile);
		return returnMap;
	}

}
