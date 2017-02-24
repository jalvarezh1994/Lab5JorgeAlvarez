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
public class Restaurante extends Lugar {

    private String Categoria;
    private int Calificacion;

    public Restaurante() {
        super();
    }

    public Restaurante(String Categoria, int Calificacion, String Nombre, String Direccion, int NivelDeSeguridad, Carretera CarreteraDeSalida) {
        super(Nombre, Direccion, NivelDeSeguridad, CarreteraDeSalida);
        this.Categoria = Categoria;
        this.Calificacion = Calificacion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        if (Categoria.equalsIgnoreCase("Chino")
                || Categoria.equalsIgnoreCase("Mexicano")
                || Categoria.equalsIgnoreCase("Italiano")
                || Categoria.equalsIgnoreCase("Comida rápida")) {
            this.Categoria = Categoria;
        }
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        if (Calificacion > 0 && Calificacion <= 5) {
            this.Calificacion = Calificacion;
        }
    }

    @Override
    public String toString() {
        return "Restaurante{" + "Categoria=" + Categoria + ", Calificacion=" + Calificacion + '}';
    }

}
