package Hackkerrank;
 import java.util.*;
 import java.io.*;
public class BiCycle {
 String define_me()
 {
	 return "a vechicle with pedals.";
	 
 }
 
} 
class MoterCycle extends BiCycle {
	String define_me()
	{
		return "a cycle with  an engine."
;
		}
	MoterCycle()
	{
		System.out.println("Hello I am a motercycle," + define_me());
;
String temp = super.define_me();
System.out.println("my ancestor is a cycle " + temp);
}
}
class Solution{
	public static void main(String []args){
		MoterCycle M=new MoterCycle();
	}
}
