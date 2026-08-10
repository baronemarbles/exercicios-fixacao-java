/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandesfelinos;
import java.util.ArrayList;
import java.lang.StringBuilder;
/**
 *
 * @author app-almoxarifado
 */

public class OncaPintada extends Panthera implements Procriacao{
    public String nome;
    protected float idade=0;
    protected String sexo;
    protected String pelagem;
    protected String fenotipoPelo= "Aa";//padrao, com chance de haver diversidade
    protected String aleloDominantePelo="A"; //O níveis considerados naturais de melanina nos indivíduos dessa espécie o caracterizam como amarelo claro com rosetas escuras
    private StringBuilder builder = new StringBuilder();
//    private boolean isGravida=false;
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public float getIdade(){
        return idade;
    }
    
    public void setIdade(float idade){
        this.idade=idade;
    }
    
    public String getFenotipoPelo(){
        return this.fenotipoPelo;
    }
    
    public void setFenotipoPelo(String fenotipoPelo){
        this.fenotipoPelo=fenotipoPelo;
    }
    
    public String getPelagem(){
        return this.pelagem;
    }
    
    private void setPelagem(){
        if((this.fenotipoPelo).contains(this.aleloDominantePelo)){
            this.pelagem="Amarela clara com Rosetas castanhas e avermelhadas";
        } else{
            this.pelagem="Marrom muito escuro com rosetas pretas";
        }
    }
    protected void verificarPelagem(){
        if((this.fenotipoPelo).contains("A")&&(this.pelagem).equals("Amarela clara com Rosetas castanhas e avermelhadas")){
            System.out.println("Tudo ok, pelagem é condizente com o fenotipo");
        } 
        
        else if(((this.fenotipoPelo).contains("A"))==false&&(this.pelagem).equals("Amarela clara com Rosetas castanhas e avermelhadas")){
            setPelagem();
        }
//        if((this.fenotipoPelo).contains(this.aleloDominantePelo)){
//            this.pelagem="Amarela clara com Rosetas castanhas e avermelhadas";
//        } else{
//            this.pelagem="Marrom muito escuro com rosetas pretas";
//        }
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    public OncaPintada(){
        this.idade=0;
        this.pelagem="Amarela clara com Rosetas castanhas e avermelhadas";
        forcaMordida=2000;
    }
    
    
    
    
   @Override
    public void makeSound(){
        System.out.println("ROARR!!!!!!!!!!");
    }
    
   @Override
    public boolean cacaSozinho(){
        return true;
    }
   
    @Override
    public void ataque(){
        System.out.println("Morde a base do crânio da presa");
    }
    
    @Override
    public void gerarDescendentes(OncaPintada parceiro){
        ArrayList<String>alelosCriaPossiveis = new ArrayList<String>();
//        if(this.isGravida==false){
//            System.out.println("A femea já está prenha!")
//        }
        if((this.sexo).equals("femea")&&(parceiro.sexo).equals("macho")){
            char[] alelosPai = parceiro.getFenotipoPelo().toCharArray();
            char[] alelosMae = this.getFenotipoPelo().toCharArray();
            ArrayList<Character> alelosCria = new ArrayList<Character>();
            
                alelosCria.add(alelosPai[0]);
                alelosCria.add(alelosMae[0]);
//                alelosCria.add(',');
                alelosCria.add(alelosPai[0]);
                alelosCria.add(alelosMae[1]);
//                alelosCria.add(',');
                alelosCria.add(alelosPai[1]);
                alelosCria.add(alelosMae[0]);
//                alelosCria.add(',');
                alelosCria.add(alelosPai[1]);
                alelosCria.add(alelosMae[1]);
                
                String alelosCriaLiteral= alelosCria.toString();
                for(int i=0;i<alelosCria.size();i++){
                    System.out.format("Alelo cria: %c\n", alelosCria.get(i));
                }
                
                System.out.format("Apos conversao para String: %s\n", alelosCriaLiteral);
                System.out.format("Apos conversao para String: %c\n", alelosCriaLiteral.charAt(0));
                System.out.format("Apos conversao para String: %c\n", alelosCriaLiteral.charAt(1));
                System.out.println("Clear na arraylist<Character> dos alelosCria efetuado");
                for(int i=0;i<alelosCriaLiteral.length();i++){
                    if(i<alelosCriaLiteral.length()-1){
                        if(alelosCriaLiteral.charAt(i)==','){
                        System.out.println("Bypass no loop será executado devido a ser uma virgula!");    
                        continue;
                        }
                        else{
                            builder.append(alelosCriaLiteral.charAt(i));
                            builder.append(alelosCriaLiteral.charAt(i+1));
//                            var listOfAlelos = new ArrayList<String>();
                            alelosCriaPossiveis.add(builder.toString());
//                            builder.setLength(0);
                            i=i+2;
                        }
                    }
                    
                    
                }
                
            for (String alelos : alelosCriaPossiveis) {
                System.out.format("Lista dos genóticos de pelagem possiveis: %s\n", alelos );
            }

//              for(int i=0;i<alelosCriaPossiveis.size();i++){
//                  System.out.format("Lista dos genóticos de pelagem possiveis:s\n", alelosCriaPossiveis.get(i));
//              }
            /*
            while(i<2){
            if(i==1){
            alelosCria.add(alelosPai[i]);
            alelosCria.add(alelosMae[0]);
            alelosCria.add(',');
            alelosCria.add(alelosPai[i]);
            alelosCria.add(alelosMae[0]);
            }
            else{
            alelosCria.add(alelosPai[i]);
            alelosCria.add(alelosMae[0]);
            alelosCria.add(',');
            alelosCria.add(alelosPai[i]);
            alelosCria.add(alelosMae[1]);
            alelosCria.add(',');
            }
            i++;
            //                alelosCria.add(alelosPai[0]);
            //                alelosCria.add(alelosMae[1]);
            //                alelosCria.add(',');
            //                alelosCria.add(alelosPai[1]);
            //                alelosCria.add(alelosMae[0]);
            //                alelosCria.add(',');
            //                alelosCria.add(alelosPai[1]);
            //                alelosCria.add(alelosMae[1]);
            }
             */
            //armazenar possibilidades no array, escolha aleatoria de uma das possibilidades considerando a probabilidade e escolha randomica de genero
            
            System.out.println(alelosCriaPossiveis+"\n");
        } else{
            System.out.println("Não foi possível, a reprodução desta espécie só ocorre entre um macho e uma femea");
        }
        
        System.out.println(alelosCriaPossiveis.get(0));
//apenas a femea pode dar a luz, portanto a cupula acontece nela e é gerada através dela, função vai ser dela
    }
    
}
