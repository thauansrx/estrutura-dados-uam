/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Racional;

/**
 *
 * @author Thauan Trindade
 */
public class Racional {

    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    private int getNumerador() {
        return numerador;
    }

    private void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    private int getDenominador() {
        return denominador;
    }

    private void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void multiplicar(Racional r) {
        this.numerador = r.getNumerador() * this.getNumerador();
        this.denominador = r.getDenominador() * this.getDenominador();
    }

    public Racional multiplicar2(Racional r) {
        int n;
        int d;
        n = r.getNumerador() * this.getNumerador();
        d = r.getDenominador() * this.getDenominador();
        Racional racional_multiplicado = new Racional(n, d);

        return racional_multiplicado;
    }

    public Racional soma(Racional r) {

        int n;
        int d;

        n = (this.numerador * r.getDenominador()) + (this.denominador * r.getNumerador());
        d = (this.denominador * r.getDenominador());

        Racional racional_soma = new Racional(n, d);

        return racional_soma;
    }

    public Racional subtrair(Racional r) {

        int n;
        int d;

        n = (this.numerador * r.getDenominador()) - (this.denominador * r.getNumerador());
        d = (this.denominador * r.getDenominador());

        Racional racional_subtrair = new Racional(n, d);

        return racional_subtrair;
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador; // Impressão simples. 
    }
}
