/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentchallangeudemy;
import java.util.Scanner;

/**
 *
 * @author app-almoxarifado
 */
public class StudentChallangeUdemy {

    public static void main(String[] args) {
         int opPrograma;
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Insira o código do exercício: ");
         System.out.println("0- Área dos triangulos");
         System.out.println("1- Cálculo de Perimetro e Volume de um cuboid");
         System.out.println("2- Troca de valores de variáveis com operadores de bitshift");
         opPrograma= sc.nextInt();
;        if(opPrograma==0){
            int op = 0;   
            float a,b,c =0;
            System.out.println("O triangulo é Equilátero, Escaleno ou Retangulo ?");
            System.out.println("1- Equilátero");
            System.out.println("2- Escaleno");
            System.out.println("3- Retangulo");
            op = sc.nextInt();
            switch(op){
                case 1://equilátero
                    System.out.println("Insira o valor de um dos lados: ");
                    a = sc.nextFloat();
                    double raizDeTres=1.7;
                    System.out.println("Area: "+(Math.pow(a,2)*raizDeTres)/4);
                    break;

                case 2://escaleno
                    System.out.println("Insira os lados: 'a','b','c': ");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    c = sc.nextFloat();
                    double s =(.5*(a+b+c));
                    System.out.println("Area: "+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                    break;

                case 3:
                    System.out.println("Insira a altura e base: ");
                    float altura = sc.nextFloat();
                    float base = sc.nextFloat(); 
                    System.out.println(.5*(base*altura));
                    break;
            }
        }

else if(opPrograma==1){
            RootsOfQuadraticOp rq1= new RootsOfQuadraticOp(1,-7,6);
            rq1.calc();
            
            System.out.println("Agora vamos ver o CUBOID!");
            System.out.println("Altura, Largura e Profundidade=2M");
            CuboidOp cub1 = new CuboidOp(2.0,2.0,2.0);
            System.out.println("height: "+cub1.height+ ", lenght: "+ cub1.lenght+ ", breadth: "+cub1.breadth);
            System.out.println("Volume: "+cub1.chooseOperation(1));
            System.out.println("Perimetro: "+cub1.chooseOperation(2));
        }

else if(opPrograma==2){
            System.out.println("Insira o valor da primeira variável e depois o da segunda:");
            Swapper swp1 = new Swapper(sc.nextInt(),sc.nextInt());
            swp1.SwapValues();
        }
    }
}

