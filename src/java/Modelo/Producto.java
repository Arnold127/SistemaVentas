/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USER
 */
public class Producto {

    int id;
    String nom;
    Double pre;
    int stock;
    String estado;

    public Producto(int id, String nom, Double pre, int stock, String estado) {
        this.id = id;
        this.nom = nom;
        this.pre = pre;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPre() {
        return pre;
    }

    public void setPre(Double pre) {
        this.pre = pre;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
