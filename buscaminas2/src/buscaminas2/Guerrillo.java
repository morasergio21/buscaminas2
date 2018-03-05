/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas2;

/**
 *
 * @author Estudiantes
 */
public class Guerrillo {
    
    void sembrarMinas(Celda lasCeldas[][],int cantidad){
        for(Celda[] laFila:lasCeldas){
            for(Celda laCelda:laFila){
                laCelda.setmiMina(new Mina());
            }
        }
    }
    
}
