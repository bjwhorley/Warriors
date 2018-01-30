package com.ravens;

public class PassParam {


    public static void main(String[] args) {


        PassParam sendv = new PassParam();
        int result = sendv.add(4390,4322);
        double sum = sendv.substract(45.132, 2898.123);
        String name = sendv.FullName("Byrn's Birthday is", " August 22nd");

        System.out.println("Birthday: " +name);
        System.out.println("Value of result is: " +result);


        System.out.println("Value of c is: " +sum);
    }


    public static int add(int a, int b){

        int result = a + b;

        return result;

    }

    public double substract(double a, double b){
        double c = b -a;
        return c;

    }

    public static String FullName(String FirstName, String LastName){

        String fullname = FirstName+LastName;
        return fullname;
    }
}