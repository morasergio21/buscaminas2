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
public class Celda {
    
    private boolean estado;
    private Bandera miBandera;
    private Mina miMina;
    private int minasAlr;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Bandera getMiBandera() {
        return miBandera;
    }

    public void setMiBandera(Bandera miBandera) {
        this.miBandera = miBandera;
    }

    public Mina getmiMina() {
        return miMina;
    }

    public void setmiMina(Mina miMina) {
        this.miMina = miMina;
    }

    public int getMinasAlr() {
        return minasAlr;
    }

    public void setMinasAlr(int minasAlr) {
        this.minasAlr = minasAlr;
    }
    
    
    
    
    
}
