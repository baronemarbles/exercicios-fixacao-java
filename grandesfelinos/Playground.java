/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grandesfelinos;

/**
 *
 * @author app-almoxarifado
 */
public class Playground {
    public static void main(String[] args){
        
        OncaPintada mamba = new OncaPintada();
        mamba.setNome("Mamba");
        mamba.setIdade(2);
        mamba.setSexo("femea");
        
        System.out.format("Nome do indíviduo: %s \n",mamba.getNome());
        System.out.format("Idade em meses: %.2f \n",mamba.getIdade());
        System.out.format("Sexo do invidiuo: %s \n",mamba.getSexo());
        System.out.format("Pelagem da Mamba padrao: %s \n",mamba.getPelagem());
        mamba.setFenotipoPelo("aa");
        mamba.verificarPelagem();
        System.out.format("Pelagem da Mamba apos definicao correta: %s\n",mamba.getPelagem());
        
        
        OncaPintada odara = new OncaPintada();
        odara.setNome("Odara");
        odara.setIdade(2);
        odara.setSexo("femea");
        
        System.out.format("Nome do indíviduo: %s \n",odara.getNome());
        System.out.format("Idade em meses: %.2f \n",odara.getIdade());
        System.out.format("Sexo do invidiuo: %s \n",odara.getSexo());
        System.out.format("Pelagem da Odara padrao: %s \n",odara.getPelagem());
        odara.setFenotipoPelo("AA");
        odara.verificarPelagem();
//        System.out.format("Pelagem da Odara apos definicao correta: %s\n",odara.getPelagem());

        
        OncaPintada ravi = new OncaPintada();
        ravi.setNome("Ravi");
        ravi.setIdade(2.5f);
        ravi.setSexo("macho");
        
        System.out.format("Nome do indíviduo: %s \n",ravi.getNome());
        System.out.format("Idade em meses: %.2f \n",ravi.getIdade());
        System.out.format("Sexo do invidiuo: %s \n",ravi.getSexo());
        System.out.format("Pelagem do Ravi: %s \n",ravi.getPelagem());
        
        System.out.format("As onças %s e %s irão acasalar. \n",mamba.getNome(),ravi.getNome());
        mamba.gerarDescendentes(ravi);
        
        System.out.format("As onças %s e %s irão acasalar. \n",mamba.getNome(),odara.getNome());
        mamba.gerarDescendentes(odara);
    
    }
}
