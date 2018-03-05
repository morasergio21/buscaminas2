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
public class Tablero {

    private Celda misCeldas[][];
    private Guerrillo misMinas;
    private Bandera miBandera;
    private int minasAlr;
    private Cronometro miCronometro;
    private Contador miContador;
    private Emoji miEmoji;
    

    public Tablero(int ancho, int largo) {

        misCeldas = new Celda[ancho][largo];
        
        for(int fila=0;fila<largo;fila++){
            for(int columna=0;columna<ancho;columna++){
                misCeldas[fila][columna]=new Celda();
            }    
        }

        Guerrillo miGuerrillo;
        miGuerrillo = new Guerrillo();

    }
}
