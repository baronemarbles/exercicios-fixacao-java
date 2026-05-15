/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentchallangeudemy;

/**
 *
 * @author app-almoxarifado
 */
public class Swapper {
    private int a,b;
 
    
    private void setA(int a){
        this.a=a;
    }
    
    public int getA(){
        return a;
    }
    
    private void setB(int b){
        this.b=b;
    }
    
    public int getB(){
        return b;
    }
  
    public Swapper(int a,int b){
      setA(a);
      setB(b);
  }
    
    public void SwapValues(){
        System.out.println("A será trocado por B e vice-versa.");
        System.out.println(String.format("Valor inteiro: %d, valor em Bits: %s", getA(), Integer.toBinaryString(getA()) ) );
        System.out.println(String.format("Valor inteiro: %d, valor em Bits: %s", getB(), Integer.toBinaryString(getB()) ) );
        
//        System.out.println(String.format("Valor de A Decimal: %d \n Valor de B Decimal: %d", getA(),getB()));
        setA(Integer.parseInt(Integer.toBinaryString(getA())));
        System.out.println(String.format("Valor de A em bits como INT: %d",getA()));
        setB(Integer.parseInt(Integer.toBinaryString(getB())));
        System.out.println(String.format("Valor de B em bits como INT: %d",getB()));

//        int count=0;
//        int aBin=Integer.parseInt(Integer.toBinaryString(getA())),bBin=Integer.parseInt(Integer.toBinaryString(getB()));
          setA(a^b);
          setB(a^b);
          setA(a^b);
          
//          setA(Integer.parseInt(getA()));
//          setB()
          
          System.out.println(String.format("Valores trocados em BIN:\n A: %d \n B: %d", getA(),getB()));
          System.out.println(String.format("Valores trocados em Decimal:\n A: %d \n B: %d", getA(),getB()));
        
               
        
        
        
        
    }
        
}
