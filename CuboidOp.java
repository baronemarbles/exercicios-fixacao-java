/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentchallangeudemy;

/**
 *
 * @author app-almoxarifado
 */
public class CuboidOp {
    //faces do retangulo
    protected double height,lenght,breadth;
    
    public CuboidOp(double height, double lenght, double breadth){
        this.height=height;
        this.lenght=lenght;
        this.breadth=breadth;
        
        
    }
    
    private double calcFront_Back_Side(){
        return height*lenght;
    }
    
    private double calcRight_Left_Side(){
        return breadth*height;
    }
    
    private double calcBottom_Top_Side(){
        return lenght*breadth;
    }
    
    protected double calcVolume(){
        return lenght*height*breadth;
    }
    
    protected double calcPerimeter(){
        return lenght+height+breadth;
    }
    
    public float mensagemPadrao(){
        return 0;
    }
    
   public double chooseOperation(int op){
       return (switch(op){
           case 1->//Volume
               calcVolume();
           case 2->//Perimeter
               calcPerimeter();
           default->
               mensagemPadrao();
       });
   }
    
    
}
