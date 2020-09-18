package Hackkerrank;



	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Exceptionhandling {

	    public static void main(String[] args) {
	        try(Scanner scanner = new Scanner(System.in))
	        {
	            System.out.println(scanner.nextInt()/scanner.nextInt());
	        }
	        catch(ArithmeticException e)
	        {
	            System.out.println(e);
	        }
	        catch (InputMismatchException ime)
	        {
	            System.out.println(ime.getClass().getName());
	        }
	       
	    }
	}
