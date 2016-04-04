/**
 * 
 */
package com.cute93;

/**
 * @author cute93
 * @since 2016.03.31
 *
 */
public class MyInt {
	private int n;
	public MyInt() {
		// TODO Auto-generated constructor stub
		this.n = Integer.MAX_VALUE;
	}
	public MyInt(int n){
		this.n =n;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	public void sayN(){
		System.out.println("나는 "+n+"을 가지고 있어요...");
	}
	
	public void sayBornYear(){
		System.out.println(n+"살이구나...");
		System.out.println((2016-n+1)+"년에 태어났겠는걸...");
	}
	
}
