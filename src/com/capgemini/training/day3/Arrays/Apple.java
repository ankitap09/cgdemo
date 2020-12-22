package com.capgemini.training.day3.Arrays;

class AppleDemo {
	private String color;
	
	public AppleDemo()
	{
		this.color="green";
	}

	  
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color =color;
	}
}

	public class Apple
	{
		public static void main(String[] args) {
			AppleDemo apple=new AppleDemo();
			System.out.println(apple.getColor());
			changeColor(apple);
			System.out.println(apple.getColor());
		}

		private static void changeColor(AppleDemo apple) {
			// TODO Auto-generated method stub
			//apple=new AppleDemo();
			apple.setColor("red");
			
			
		}
		
		/*private static AppleDemo changeColor(AppleDemo apple) {
			// TODO Auto-generated method stub
			//apple=new AppleDemo();
			apple.setColor("red");
			
			return apple;
		}*/
		
		
	  
		
		
			
			
		}