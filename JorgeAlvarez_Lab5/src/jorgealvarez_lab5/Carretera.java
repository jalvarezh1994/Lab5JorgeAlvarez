/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarez_lab5;

/**
 *
 * @author ofici
 */
public class Carretera {

    private int NumeroUnico;
    private float Distancia;
    private Lugar LugarInicio;
    private Lugar LugarFinal;

    public Carretera() {
    }

    public Carretera(int NumeroUnico, float Distancia, Lugar LugarInicio, Lugar LugarFinal) {
        this.NumeroUnico = NumeroUnico;
        this.Distancia = Distancia;
        this.LugarInicio = LugarInicio;
        this.LugarFinal = LugarFinal;
    }

    public int getNumeroUnico() {
        return NumeroUnico;
    }

    public void setNumeroUnico(int NumeroUnico) {
        this.NumeroUnico = NumeroUnico;
    }

    public float getDistancia() {
        return Distancia;
    }

    public void setDistancia(float Distancia) {
        this.Distancia = Distancia;
    }

    public Lugar getLugarInicio() {
        return LugarInicio;
    }

    public void setLugarInicio(Lugar LugarInicio) {
        this.LugarInicio = LugarInicio;
    }

    public Lugar getLugarFinal() {
        return LugarFinal;
    }

    public void setLugarFinal(Lugar LugarFinal) {
        this.LugarFinal = LugarFinal;
    }

    @Override
    public String toString() {
        return "Carretera{" + "NumeroUnico=" + NumeroUnico + ", Distancia=" + Distancia + ", LugarInicio=" + LugarInicio + ", LugarFinal=" + LugarFinal + '}';
    }

}
