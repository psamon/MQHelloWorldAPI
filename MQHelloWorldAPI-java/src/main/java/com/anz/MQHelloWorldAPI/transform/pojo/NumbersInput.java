package com.anz.MQHelloWorldAPI.transform.pojo;

import com.anz.common.transform.ITransformPojo;

/**
 * @author sanketsw
 *
 */
public class NumbersInput implements ITransformPojo {
	
	String text;
	
	int left;
	
	int right;
	
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}

	
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

}
