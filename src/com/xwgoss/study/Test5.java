package com.xwgoss.study;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 * 7
 * 3 8
 * 8 1 0
 * 2 7 4 4
 * 4 5 2 6 5
 * 
 * 在上面的数字三角形中寻找一条从顶部到底边的路径，
 * 使得路径上所经过的数字之和最大。
 * 路径上的每一步都只能往左下或 右下走。
 * 只需要求出这个最大和即可，不必给出具体路径。
 *  三角形的行数大于1小于等于100，数字为 0 - 99
 */
public class Test5 {

	@Test
	public void test() {
		int[][] m={{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		assertEquals(30, dpStudy(m, 5));
	}
	
	private int dpStudy(int[][] m,int n){
		if(m==null)
			return 0;
		if(n<1||m.length<1)
			return 0;
		if(n==1&&m.length>=n)
			return m[0][0];
		int[] maxSum=m[m.length-1];
		for(int j=m.length-1;j>0;j--){
			for(int i=0;i<j;i++){
				maxSum[i]=m[j-1][i]+max(maxSum[i],maxSum[i+1]);
			}
		}
		return maxSum[0];
	}

	private int max(int i, int j) {
		// TODO Auto-generated method stub
		return i>j?i:j;
	}

}
