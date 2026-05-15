/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentchallangeudemy;

/**
 *
 * @author app-almoxarifado
 */
public class RootsOfQuadraticOp {
    int a,b,c;
     public RootsOfQuadraticOp(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        
    }
      public void calc(){
          double toBeSqrt=Math.pow(b,2)-4*a*c;
          if(toBeSqrt<0){
              System.out.println("Não é possível de calcular!");
          } else{
              double result= (-b + Math.sqrt(toBeSqrt))/2*a;
              System.out.println("Delta1 é : "+result);
              
              
              System.out.println("Delta2 é : "+((-b - Math.sqrt(toBeSqrt))/2*a));
          }
      }
}
