/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.grandesfelinos;
import java.util.ArrayList;

/**
 *
 * @author app-almoxarifado
 */
public interface Procriacao {
//    public boolean hasChildren=false;
    public ArrayList<Integer> decendents = new ArrayList();
    public void gerarDescendentes(OncaPintada parceiro);//verificar o sexo dentro da funcao, se não for sexos diferentes, cancela(retorna) e printa que não há capacidade de reprodução nessas condições. Caso contrário, gerar novo indivíduo(classe) a partir dos fenótipos do parceiro
}
