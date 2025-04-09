/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.jotape.garage.DTO;

import local.jotape.garage99.entities.Veiculos;

/**
 *
 * @author sesideva
 */
public class VeiculoDTO {
    
    private long id;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private double km;
    private String linkimagem;

    public VeiculoDTO(Veiculos x) {
    }
    
    
    public VeiculoDTO(long id, String marca, String modelo, String cor, int ano, double km, String linkimagem) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.km = km;
        this.linkimagem = linkimagem;
    }

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getKm() {
        return km;
    }

    public String getLinkimagem() {
        return linkimagem;
    }
    
    
    
}
