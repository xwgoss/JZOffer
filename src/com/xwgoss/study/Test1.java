package com.xwgoss.study;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Test1 {
	private int[][] array;
	private int target;

	@BeforeClass
	public void init() {

	}

	@Test
	public void test() {
		assertTrue(duijiao2());
	}

	private boolean duijiao1() {
		int weight = array.length;
		int height = array[0].length;
		for (; height > 0; height = height - 1) {
			if (target == array[0][height - 1])
				return true;
			if (target > array[0][height - 1]) {
				for (int i = 1; i < weight; i++) {
					if (target == array[height][i])
						return true;
				}
				return false;
			}
			if (target < array[0][height - 1])
				continue;
		}
		return false;

	}
	
	private boolean duijiao2() {
		int weight = array.length;
		int height = array[0].length;
		int i=1;
		for (; height > 0; height = height - 1) {
			if (target == array[0][height - 1])
				return true;
			for(;i<weight;i++){
				if(target==array[i][height-1])
					return true;
				else if(target>array[i][height-1])
					continue;
				else{
					break;
				}
			}
		}
		return false;

	}
}
