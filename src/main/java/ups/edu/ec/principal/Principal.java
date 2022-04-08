/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.principal;

/**
 *
 * @author PC-01
 */
public class Principal {

    public static void main(String[] args) {
        
         var empleado = new Empleado();
        empleado.nombre = "Juan Lopez";
        empleado.horasTrabajadas = 100;
        empleado.costoHora = 6;
        empleado.añoIngreso = 2010;
        
        var empleado1 = new Empleado();
        empleado1.nombre = "Maria Escandon";
        empleado1.horasTrabajadas = 200;
        empleado1.costoHora = 5;
        empleado1.añoIngreso = 2020;
     
        var empleado2 = new Empleado();
        empleado2.nombre = "Julio Leon";
        empleado2.horasTrabajadas = 150;
        empleado2.costoHora = 8;
        empleado2.añoIngreso = 2018; 
        
        var añoTrabajado=empleado.calcularIngresos(2022);
        System.out.println("El empleado tiene "+añoTrabajado+" dolares");
        
        var añoTrabajado1=empleado1.calcularIngresos(2022);
        System.out.println("El empleado tiene "+añoTrabajado1+" dolares");
        
        var añoTrabajado2=empleado2.calcularIngresos(2022);
        System.out.println("El empleado tiene "+añoTrabajado2+" dolares");
        
        var horasExtra = empleado.calcularBonoHorasExtra(100);
        System.out.println("El bono es "+horasExtra);
        
        var horasExtra1 = empleado1.calcularBonoHorasExtra(100);
        System.out.println("El bono es "+horasExtra1);
        
        var horasExtra2 = empleado2.calcularBonoHorasExtra(100);
        System.out.println("El bono es "+horasExtra2);
        
        
    }
}
