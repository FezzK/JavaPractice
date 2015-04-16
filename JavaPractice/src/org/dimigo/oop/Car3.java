package org.dimigo.oop;

public class Car3 {
	 public String company;
	 public String model;
	 public String color;
	 public int maxSpeed;
	 public int price;
	 public Car3(String company, String model, String color, int maxSpeed, int price)
	 {
		 this.company=company;
		 this.model=model;
		 this.color=color;
		 this.maxSpeed=maxSpeed;
		 this.price=price;
	 }
	 public Car3(String company, String model, String color, int maxSpeed)
	 {
		 this(company,model,color,maxSpeed,0);
	 }
	 public Car3(String company, String model, String color)
	 {
		 this(company,model,color,0,0);
	 }
	 public String getCompany()
	 {
		 return company;
	 }
	 public String getModel()
	 {
		 return model;
	 }
	 public String getColor()
	 {
		 return color;
	 }
	 public int getMaxSpeed()
	 {
		 return maxSpeed;
	 }
	 public int getPrice()
	 {
		 return price;
	 }
	 /*
	 public void setCompany(String newcompany)
	 {
		 company=newcompany;
	 }
	 public void setModel(String newmodel)
	 {
		 model=newmodel;
	 }
	 public void setColor(String newcolor)
	 {
		 color=newcolor;
	 }
	 public void setMaxSpeed(int newmaxSpeed)
	 {
		 maxSpeed=newmaxSpeed;
	 }
	 public void setPrice(int newPrice)
	 {
		 price=newPrice;
	 }*/
}
