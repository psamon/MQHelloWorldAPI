package com.anz.MQHelloWorldAPI.transform.pojo;

import com.anz.common.transform.ITransformPojo;

/**
 * @author sanketsw
 *
 */
public class NumbersInput implements ITransformPojo {
	
	String text;
	
	/**
	 * @return the left
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param left the left to set
	 */
	public void setText(String text) {
		this.text = text;
	}

}
