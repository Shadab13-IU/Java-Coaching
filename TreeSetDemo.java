package mypkg;
import java.util.*;
class TreeSetDemo{
	public static void main(String[] args){
		String s="Lucknow Junction";
		Set<Character> st=new TreeSet<>();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)==' ')continue;
			st.add(s.charAt(i));// 	add method is override here add is basically called of Set interface //
		}
		System.out.println(st.size());
	}
}
