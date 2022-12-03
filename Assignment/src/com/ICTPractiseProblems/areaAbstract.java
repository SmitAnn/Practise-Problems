package com.ICTPractiseProblems;

//Creating abstract class and methods

abstract class Shape{
	
	abstract void RectangleArea(float length,float breadth);
	abstract void SquareArea(float side);
	abstract void CircleArea(float radius);
	
}

// Creating Class Area
 class Area extends Shape{
	 double Area=0;
	 
	 void RectangleArea(float length,float breadth)
	 {
		 Area =length * breadth;
		System.out.println("Area of Rectangle is :   "  + Area);
	 }
	 
	 void SquareArea(float side)
	 {
	 Area=side*side;
	 System.out.println("Area of Square is : "  + Area);
	 }
	 
     void CircleArea(float radius)
     {
	  Area= 3.14*(radius*radius);
	  System.out.println("Area of Circle is : "  + Area);
     }
 }

public class areaAbstract {

	public static void main(String[] args) {
		
			Area a= new Area();
			a.RectangleArea(2.5f,3f);
			a.SquareArea(5f);
			a.CircleArea(4.5f);
		}
	}

