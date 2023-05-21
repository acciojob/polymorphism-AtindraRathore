package com.driver;

public class Main {
 class Product{
        //create a method of following defination
        //public int product(int x, int y) {}
       public int product(int x,int y)
        {
            return x*y;
        }
        public int product(int x,int y,int z)
        {
            return x*y*z;
        }
        public double product(double x,double y)
        {
            return x*y;
        }
    }
    public static void main(String[] args) {
        //create object of Product in Main function called p
       Product p=new Product();
     //call this method also from Main using Product class object p

        System.out.println(p.product(2,5));
        System.out.println(p.product(2,4,3));
        System.out.println(p.product(1.00,3.00));
    }
}
