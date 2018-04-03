package edu.handong.csee.java.Overload;

// TODO what suup later
public class Overload {

	public static void main(String[] args) {
		double average= Overload.getAverage(30, 40);
		double average2= Overload.getAverage(30, 40, 50);
		char average3= Overload.getAverage('a','c');
		
		System.out.println(average);
		System.out.println(average2);
		System.out.println(average3);
	}

	public static double getAverage(double first, double second)
	{
		return (first+second)/2;
	}
	
	public static double getAverage(double first, double second, double third)
	{
		return (first+second+third)/3;
	}
	
	public static char getAverage(char first, char second)
	{
		return (char)((char)(first+second)/2);
	}
}
