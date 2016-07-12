/*
*************************************************
File name:		Ooption.java
Author:			Justin
Date Created:	12 Jul 2016
Purpose:		



*************************************************
*/

package com.justin;

import java.util.Optional;

public class Ooption
{ 
	private Integer a1;
	
	public Ooption(Integer a)
	{
		this.a1 = a;
	}
	
 public static void main(String...args)
 {
	 Ooption obj = new Ooption(1);
	 Optional<Integer> optional = Optional.ofNullable(obj.a1);
 }
 
 public Integer sum(Integer a, Integer b)
 {
	 
 }
 	
	
}
