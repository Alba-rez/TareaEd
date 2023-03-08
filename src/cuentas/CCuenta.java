/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 * Clase donde se gestionan movimientos de una cuenta bancaria
 * @author albaa_000
 */
 public class CCuenta {

    /**
     * Devuelve el nombre del titular de la cuenta
     * @return nombre titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta
     * @param nombre nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el numero de cuenta
     * @param cuenta nuemro de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo actualizado de la cuenta
     * @return saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo actual de la cuenta
     * @param saldo saldo actual
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés de la cuenta
     * @return el tipo Interés de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés que se le aplicará a la cuenta
     * @param tipoInteres tipo de interés aplicado a la cuenta
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     *  Nombre del titular de la cuenta
     */
    private String nombre;
    /**
     * Número de cuenta
     */
    private String cuenta;
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    /**
     * Tipo de interés aplicado a la cuenta
     */
    private double tipoInteres;

    /**
     * Constructor por defecto sin parametros con valores por defecto
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con parametros con valores dados
     * @param nom  nombre del titular de la cuenta
     * @param cue número de cuenta
     * @param sal saldo inicial de la cuenta
     * @param tipo tipo de interés aplicado a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Devuelve el estado actual de la cuenta
     * @return estado actual de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Realiza un ingreso
     * @param cantidad cantidad a ingresar en la cuenta
     * @throws Exception si la cantidad a ingresar menor de 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Realiza una retirada de saldo
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad es menor o igual a 0,o si el saldo actualizado de la cuenta es menor que la cantidad a retirar 
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
   

