package com.xwgoss.study;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 * 写一段程序，删除字符串a中包含的字符串b，
 * 举例 输入a = "asdw",b = "sd" 返回 字符串 "aw"，并且测试这个程序
 */
public class Test2 {

	@Test
	public void testStr(){
		String str=test("ab","ab");
		assertEquals("", str);
	}
	
	public String test(String str, String targetStr) {
		StringBuffer sb = new StringBuffer();
		if(str==null|targetStr==null)
			return sb.toString();
		if (str.length() >= targetStr.length()) {
			for (int i = 0; i < str.length(); i++) {
				if ((i + targetStr.length()) > str.length()) {
					sb.append(str.substring(i, str.length()));
					break;
				}
				if (!str.substring(i, (i + targetStr.length())).equals(targetStr)) {
					sb.append(str.substring(i, i + 1));
				} else {
					i = i + targetStr.length() - 1;
				}
			}
		} else
			sb.append(str);
		return sb.toString();
	}

}
