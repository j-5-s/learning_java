package com.homedepot.headfirst;

import java.util.ArrayList;

import com.homedepot.headfirst.Number;

//collection of Numbers
public class Numbers {
	
	ArrayList<Number> theList;
	ArrayList<Integer> originalList;
	
	public Numbers(int[] list){
		
		this.theList = new ArrayList<Number>();
		this.originalList = new ArrayList<Integer>();
		
		for (int i = 0; i < list.length; i++) {
			Number n;
			
			if (this.originalList.contains(list[i]) ) {
				n = theList.get(this.originalList.indexOf(list[i]));
			} else {
				n = new Number(list[i]);
			}
			
			this.theList.add(n);
			this.originalList.add(list[i]);
		}
	}
	
	public Integer size() {
		return this.originalList.size();
	}
	

	
	static public String prettyPrint(ArrayList<Integer> list, String sep1, String lastSep) {
		String str = "";
			for (int n = 0; n < list.size(); n++) {
				//is it the last one, of so, 
				str += list.get(n);
				if (n == list.size() - 2 ) {
					str += lastSep;
				} else if (n < list.size() - 1) {
					str += sep1;
				}
			}
		return str;
	}

}
