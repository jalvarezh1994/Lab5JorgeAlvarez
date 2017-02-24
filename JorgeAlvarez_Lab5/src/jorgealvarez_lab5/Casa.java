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
public class Casa extends Lugar {

    public Casa() {
        super();
    }

    public Casa(String Nombre, String Direccion, int NivelDeSeguridad, Carretera CarreteraDeSalida) {
        super(Nombre, Direccion, NivelDeSeguridad, CarreteraDeSalida);
    }

    @Override
    public String toString() {
        return super.toString()+" "+"Casa{" + '}';
    }

}
