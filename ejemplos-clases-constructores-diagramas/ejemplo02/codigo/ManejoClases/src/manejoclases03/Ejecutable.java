/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Computadora computadoraPersonal1 = new Computadora(16);
        
        Computadora computadoraPersonal2 = new Computadora("Intel");
        Computadora computadoraPersonal3 = new Computadora("Ryzen",8);
        // Se asigna valores particulares al objeto
        // a través de los métodos establecer
        
        
        
        // Se presenta valores en pantalla, rescatando los valores
        // que se necesita a través de los métodos obtener del
        // objeto 
        
        computadoraPersonal1.establecerTipoProcesador("AMD");
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersonal1.obtenerTipoProcesador(),
                computadoraPersonal1.obtenerMemoria());
        computadoraPersonal2.establecerMemoria(4);
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersonal2.obtenerTipoProcesador(),
                computadoraPersonal2.obtenerMemoria());
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                computadoraPersonal3.obtenerTipoProcesador(),
                computadoraPersonal3.obtenerMemoria());
        
    }
}
