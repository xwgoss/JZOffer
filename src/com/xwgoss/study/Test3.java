package com.xwgoss.study;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
 */
public class Test3 {

	@Test
	public void test() {
		String str=convertStr("We Are Happy");
		assertEquals("We%20Are%20Happy", str);
	}

	private String convertStr(String str){
		if(str==null)
			return "";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++){
			if(str.substring(i, i+1).equals(" "))
				sb.append("%20");
			else
				sb.append(str.substring(i, i+1));
		}
		return sb.toString();
	}
}
