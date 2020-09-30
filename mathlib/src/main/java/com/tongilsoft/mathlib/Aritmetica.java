package com.tongilsoft.mathlib;

import android.util.Log;

/**
 * Clase que implementa las cuatro operaciones básicas de la aritmética.
 * Suma, Resta, Multiplicación y División.
 */
public class Aritmetica {
    private static final String TAG = "Aritmetica";

    public Aritmetica(){
        Log.d(TAG,"constructor()");
    }

    /**
     * Suma los valores que recibe en los parametros a y b y devuelve el resultado
     * @param a (int)
     * @param b (int)
     * @return (int)
     */
    public int sumar(int a, int b){
        int r=0;
        try {
            Log.d(TAG, String.format("sumar( %d, %d )", a, b));
            r = a + b;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return r;
        }
    }

    /**
     * Resta los valores que recibe en los parametros a y b y devuelve el resultado
     * @param a (int)
     * @param b (int)
     * @return (int)
     */
    public int restar(int a, int b){
        int r=0;
        try {
            Log.d(TAG, String.format("restar( %d, %d )", a, b));
            r = a - b;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return r;
        }
    }

    /**
     * Multiplica los valores que recibe en los parametros a y b y devuelve el resultado
     * @param a (int)
     * @param b (int)
     * @return (int)
     */
    public int multiplicar(int a, int b){
        int r=0;
        try {
            Log.d(TAG, String.format("multiplicar( %d, %d )", a, b));
            r = a * b;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return r;
        }
    }

    /**
     * Divide los valores que recibe en los parametros a y b y devuelve el resultado.
     * Si se produce un error de división por cero devuelve 0 (cero).
     * @param a (int)
     * @param b (int)
     * @return (double)
     */
    public double dividir(int a, int b){
        double r=0;
        try{
            r = ((double)a /(double)b);
            String logMsg = String.format("División entre A(%d) y B(%d) = %.2f",a,b,r);
            Log.d(TAG, logMsg);
        } catch (ArithmeticException ae){
            ae.printStackTrace();
            r = 0;
        } finally {
            return r;
        }
    }
}
