package com.driver;


public class Main {
    //create a class Product inside Main class
  public  static class Product{
        //create a method of following defination
        //public int product(int x, int y) {}
      public int product(int x,int y){
          System.out.println(x+" "+y);
       return 0;
      }
      //create a Overloaded method product of following defination
      //public int product(int x, int y, int z) {}
      public int product(int x,int y,int z){
      System.out.println(x+" "+y+" "+z);
      return 0;
      }
      //create a Overloaded method product of following defination
      //public double product(double x, double y) {}
      public double product(double x,double y){
       System.out.println(x+" "+y);
       return 0.00;
      }
    }
    public static void main(String[] args) {
        //create object of Product in Main function called p
        Product p=new Product();
        //call this method also from Main using Product class object p
        p.product(5,6,7);
        p.product(5.7,6.2);
        p.product(10,20);
    }
}



