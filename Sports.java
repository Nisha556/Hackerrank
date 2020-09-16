package Hackkerrank;
import java.util.*;
public class Sports {
 String getName()
 {
	 return "Generic Sports;
 }
 void getNumberOfTeamMembers()
 {
	  System.out.println("Each team has n players");
	  
 }
}
class  Soccer extends Sports {
	String getName()
	{
		return  "Soccer Class";
	}
	void getNumberOfTeamMemebers()
	{
		System.out.println("Each team has 11 player in" + getName());
		
	}
	public class Solution{
		
	    public static void main(String []args){
	        Sports c1 = new Sports();
	        Soccer c2 = new Soccer();
	        System.out.println(c1.getName());
	        c1.getNumberOfTeamMembers();
	        System.out.println(c2.getName());
	        c2.getNumberOfTeamMembers();
		}
	}
}
