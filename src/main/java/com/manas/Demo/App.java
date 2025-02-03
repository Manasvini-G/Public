package com.manas.Demo;


/**
 * Hello world!
 *
 */
	class Shape{
		public double calculatearea() {
			return 0;
		}
	}
	class Rectangle extends Shape{
		private double length;
		private double breadth;
		public Rectangle(double length,double breadth) {
			this.length=length;
			this.breadth=breadth;
		}
		public double calculatearea() {
			return length*breadth;
		}
	}
	class Circle extends Shape{
		private double radius;
		public Circle(double radius) {
			this.radius=radius;
		}
		public double calculatearea() {
			return 3.14*radius*radius;
		}
		
	}
	class Triangle extends Shape{
		private double l;
		private double b;
		public Triangle(double l,double b) {
			this.l=l;
			this.b=b;
		}
		public double calculatearea() {
			return 0.5*l*b;
		}
		
	}
	public class App{
		
    public static void main( String[] args )
    {
        Rectangle r = new Rectangle(2.0,2.0);
        Circle c= new Circle(5.0);
        Triangle t= new Triangle(2.0,1.0);
        System.out.println("rectangle area"+" "+r.calculatearea());
        System.out.println("Triangle area"+" "+t.calculatearea());
        System.out.println("Circle area"+" "+c.calculatearea());
    }

	}
	

