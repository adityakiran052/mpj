/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignments;

/**
 *
 * @author ASUS
 */

class hillstations {
        void famousfor(){
            System.out.println("HillStation is famous for its beauty");
        }
        void famousfood(){
            System.out.println("Hillstation has traditional food");
        }
    }
    
    class manali extends hillstations{
        void famousfor(){
            System.out.println("Manali is famous for snow and mountains");
        }
        void famousfood(){
            System.out.println("Manali is famous for Siddu");
        }
    }
    
    class gulmarg extends hillstations{
        void famousfor(){
            System.out.println("Gulmarg is famous for skiing");
        }
        void famousfood(){
            System.out.println("Gulmarg is famous for Kashmiri cuisine");
        }
    }
    
    class mussoorie extends hillstations{
        void famousfor(){
            System.out.println("Mussoorie is famous for scenic beauty");
        }
        void famousfood() {
            System.out.println("Mussoorie is famous for Maggi");
        }
    }


public class third_2 {
    
    public static void main(String[] args){
        hillstations h;
        
        h = new hillstations();
        h.famousfood();
        h.famousfor();
        
        h = new manali();
        h.famousfor();
        h.famousfood();
       
        h = new mussoorie();
        h.famousfor();
        h.famousfood();

        h = new gulmarg();
        h.famousfor();
        h.famousfood();
    }
}
