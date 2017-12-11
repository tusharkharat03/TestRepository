package com.soap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SoapClientMain {

	public static void main(String[] args) {

		
		List<Integer> al= new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(6);
		al.add(9);
		al.add(21);
		al.add(11);
		al.add(9);
		

		
		Integer integer = al.get(al.size()-2);
		System.out.println("second integer is :"+integer);
		
		String s="Tushar is a good boy";
		s.split(" ");
		
		for(int i=s.length()-1;i>=0;i--){
			System.out.print("\n------------"+s.charAt(i));;
		}

	}

}
