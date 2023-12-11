/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleancode;

/**
 *
 * @author user
 */
public class Cleancode {

    /**
     * @param args the command line arguments
     */
    static public String pasarNotaCalificacion(double nota){
       String calificacion = "";
       if (nota >= 0 && nota < 5 ) calificacion = "Suspenso";
       else if (nota >= 5 && nota < 6 ) calificacion = "Aprobado";
       else if (nota >= 6 && nota < 7 ) calificacion = "Bien";
       else if (nota >= 7 && nota < 9 ) calificacion = "Notable";
       else if (nota >= 9 && nota < 10 ) calificacion = "Sobresaliente";
       return calificacion;
    }
    public static void main(String[] args) {
       int preguntas = 20;
       int aciertos = 18;
       int errores = 2;
       double nota = (aciertos - errores) / 2.0;
       String calificacion = pasarNotaCalificacion(nota);
       System.out.println(calificacion);
    }
    
}
