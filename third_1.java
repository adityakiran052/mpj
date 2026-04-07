/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments;

/**
 *
 * @author ASUS
 */
public class third_1 {
    double area;
    third_1() {
    
    }
    third_1 (double r){
        area = 3.14 * r * r;
        System.out.println("Area of circle: " + area);
    }
    third_1 (double l , double b) {
        area = l * b;
        System.out.println("Area of Rectangle: " + area);
    }
    
    void area(double s){
        System.out.println("Area of Square:" + (s*s));
    }
    
    public static void main(String[] args){
        third_1 circle = new third_1(5.0);
        third_1 rectangle = new third_1(4.0,3.0);
        third_1 obj = new third_1();
        obj.area(4.0);
    }
}








