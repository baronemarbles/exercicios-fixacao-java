/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandesfelinos;
import java.util.ArrayList;
import java.util.Random;
import java.lang.StringBuilder;
/**
 *
 * @author app-almoxarifado
 */

public class OncaPintada extends Panthera implements Procriacao{
    private static int nextId=1;
    
    private int id;
    public String nome;
    public String pai;
    public String mae;
    protected float idade=0;
    protected String sexo;
    protected String pelagem;
    protected String fenotipoPelo= "Aa";//padrao, com chance de haver diversidade
    protected String aleloDominantePelo="A"; //O níveis considerados naturais de melanina nos indivíduos dessa espécie o caracterizam como amarelo claro com rosetas escuras
    private StringBuilder builder = new StringBuilder();
    private Random rand = new Random();
//    private boolean isGravida=false;
    
    public int getId(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getMae(){
        return this.mae;
    }
    
    private void setMae(String nomeMae){
        this.mae=nomeMae;
    }
    
    public String getPai(){
        return this.pai;
    }
    
    private void setPai(String nomePai){
        this.pai=nomePai;
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
        this.id= nextId++;
        this.idade=0;
        this.pelagem="Amarela clara com Rosetas castanhas e avermelhadas";
        forcaMordida=2000;
        this.pai="Grande criador";
        this.mae="Grande criador";
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
            
                builder.append(alelosPai[0]);
                builder.append(alelosMae[0]);
                alelosCriaPossiveis.add(builder.toString()) ;
                builder.setLength(0);
                
                builder.append(alelosPai[0]);
                builder.append(alelosMae[1]);
                System.out.println("Objeto do builder depois do primeiro setLenght(0): "+builder.toString());
                alelosCriaPossiveis.add(builder.toString());
                System.out.println("Objeto dos alelos possiveis após 2 iterações do chuveirinho entre fenotipos: "+alelosCriaPossiveis);
                builder.setLength(0);
                
                builder.append(alelosPai[1]);
                builder.append(alelosMae[0]);
                System.out.println("Objeto do builder depois do segundo setLenght(0): "+builder.toString());
                alelosCriaPossiveis.add(builder.toString());
                System.out.println("Objeto dos alelos possiveis após 2 iterações do chuveirinho entre fenotipos: "+alelosCriaPossiveis);
                builder.setLength(0);
                
                builder.append(alelosPai[1]);
                builder.append(alelosMae[1]);
                System.out.println("Objeto do builder depois do segundo setLenght(0): "+builder.toString());
                alelosCriaPossiveis.add(builder.toString());
                System.out.println("Objeto dos alelos possiveis após 3 iterações do chuveirinho entre fenotipos: "+alelosCriaPossiveis);
                
                //Advindo da sorte na formação de um embrião
                String nomeCria= "cria"+this.getNome()+parceiro.getNome();
                String generoCria;
                
                if(rand.nextInt(1)==1){//0 é femea, 1 é macho.
                    generoCria="macho";
                } else {generoCria="femea";}
                OncaPintada cria = new OncaPintada();
                cria.setNome(nomeCria);
                cria.setMae(this.nome);
                cria.setPai(parceiro.nome);
                cria.setFenotipoPelo(alelosCriaPossiveis.get(rand.nextInt(4)));
                cria.verificarPelagem();
                cria.setSexo(generoCria);
                System.out.printf("\n%s nasceu, é %s e é cria de %s com %s.\nSeu fenotipo de pelo é '%s'.\nTem pelagem %s.\nTem %s anos.\n", cria.getNome(),cria.getSexo(),cria.getMae(),cria.getPai(),cria.getFenotipoPelo(),cria.getPelagem(),cria.getIdade());
                
                
                
                
                
                
                
        
                    
        }
            //armazenar possibilidades no array, escolha aleatoria de uma das possibilidades considerando a probabilidade e escolha randomica de genero

         else{
            System.out.println("Não foi possível, a reprodução desta espécie só ocorre entre um macho e uma femea");
        }
        
//        System.out.println(alelosCriaPossiveis.get(0));
//apenas a femea pode dar a luz, portanto a cupula acontece nela e é gerada através dela, função vai ser dela
    }
    
}