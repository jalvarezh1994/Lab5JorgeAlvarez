/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarez_lab5;

import java.util.ArrayList;

/**
 *
 * @author ofici
 */
public class Lugar {

    private String Nombre, Direccion;
    private int NivelDeSeguridad;
    private ArrayList<Carretera> CarreterasDeEntrada = new ArrayList();
    private Carretera CarreteraDeSalida;

    public Lugar() {
    }

    public Lugar(String Nombre, String Direccion, int NivelDeSeguridad, Carretera CarreteraDeSalida) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.NivelDeSeguridad = NivelDeSeguridad;
        this.CarreteraDeSalida = CarreteraDeSalida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNivelDeSeguridad() {
        return NivelDeSeguridad;
    }

    public void setNivelDeSeguridad(int NivelDeSeguridad) {
        this.NivelDeSeguridad = NivelDeSeguridad;
    }

    public ArrayList<Carretera> getCarreterasDeEntrada() {
        return CarreterasDeEntrada;
    }

    public void setCarreterasDeEntrada(ArrayList<Carretera> CarreterasDeEntrada) {
        this.CarreterasDeEntrada = CarreterasDeEntrada;
    }

    public Carretera getCarreteraDeSalida() {
        return CarreteraDeSalida;
    }

    public void setCarreteraDeSalida(Carretera CarreteraDeSalida) {
        this.CarreteraDeSalida = CarreteraDeSalida;
    }

    @Override
    public String toString() {
        return "Lugar{" + "Nombre=" + Nombre + ", Direccion=" + Direccion + ", NivelDeSeguridad=" + NivelDeSeguridad + ", CarreterasDeEntrada=" + CarreterasDeEntrada + ", CarreteraDeSalida=" + CarreteraDeSalida + '}';
    }

}
