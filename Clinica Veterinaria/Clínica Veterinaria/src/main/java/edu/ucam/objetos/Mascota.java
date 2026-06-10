package edu.ucam.objetos;

public class Mascota {
    private String chip;
    private String nombre;
    private String especie;
    private double peso;

    public Mascota() {}

    public String getChip() { return chip; }
    public void setChip(String chip) { this.chip = chip; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
}