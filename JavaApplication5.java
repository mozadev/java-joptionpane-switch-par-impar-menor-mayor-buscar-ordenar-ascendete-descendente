/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Jose
 */


import javax.swing.JOptionPane;

public class JavaApplication5 {

    public static void main(String[] args) {
        int num, i, menu, j;
        String cadena = "", par = "", inpar = "";
        int mayor = 0;
        int menor = 1000000000;
        int buscar;
        
        int flag=0; // se cambió el tipo de dato de boolean a int para que 
        // la asignación de "flag=1”(en el if dentro del for )del caso 6 pueda modificarse a nivel global.
        // booleano no reconoce la modificación "flag = false" a nivel global.
        int temporal;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo"));

        int[] x = new int[num];

        for (i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor[" + i + "]"));
            cadena += x[i] + ", ";
        }

        //hallando los números pares, Código q se extrajo del caso 2
        for (i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                par += x[i] + ", ";
            }
        }

        // hallando los números impares, Código q se extrajo del caso 3
        for (i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0) { // se modifico "%1==0" a " %2!=0" (condicion impar)
                inpar += x[i] + ", ";
            }
        }

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion"
                    + "\n 1) Muestra los numeros que ingresaste al arreglo "
                    + "\n 2) Numeros pares "
                    + "\n 3) Numeros impares "
                    + "\n 4) Numero mayor "
                    + "\n 5) Numero menor "
                    + "\n 6) Buscar un numero "
                    + "\n 7) Ordenar arreglo de manera acendente "
                    + "\n 8) Ordenar arreglo de forma decendete "
                    + "\n 9) Salir"));

            switch (menu) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Los valores ingresados son");
                    for (i = 0; i < x.length; i++) {
                        JOptionPane.showMessageDialog(null, x[i]);
                    }
                    JOptionPane.showMessageDialog(null, cadena);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Los valores pares ingresados son: ");
                    /*for (i = 0; i < x.length; i++) {  // el Código se movio a la linea 33
                        if (x[i] % 2 == 0) {        //fuera del switch ya que si se vuelve 
                            par += x[i] + ", ";    //a seleccionar la opción  2 la cadena "par"
                        }                         //se acumulara y se verá duplicada. 
                    }*/

                    JOptionPane.showMessageDialog(null, par);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Los valores inpares ingresados son: ");
                    /*for (i = 0; i < x.length; i++) {
                        if (x[i] % 2 != 0) {        // se modificó "%1==0" a " %2!=0" (condición impar)
                            inpar += x[i] + ", ";  //el Código se movio a la línea 40
                        }                         //fuera del switch ya que si se vueve 
                    }*/                           //a seleccionar la opción 3 la cadena "impar"
                    //se acumulará y se verá duplicada. 

                    JOptionPane.showMessageDialog(null, inpar);
                    break;
                case 4:
                    for (i = 0; i < x.length; i++) {
                        if (x[i] > mayor) {
                            mayor = x[i];
                        }
                    }
                    JOptionPane.showMessageDialog(null, "El numero mayor de los numeros ingresados es: " + mayor);
                    //se colocó la variable "mayor" para que se muestre en pantalla
                    break;
                case 5:
                    for (i = 0; i < x.length; i++) {
                        if (x[i] < menor) {
                            menor = x[i];
                        }
                    }
                    JOptionPane.showMessageDialog(null, "El numero menor de los numeros ingresados es: " + menor);
                    //se colocó la variable “menor" para que se muestre en pantalla
                    break;
                case 6:
                    buscar = Integer.parseInt(JOptionPane.showInputDialog("Que numero deseas buscar"));
               
                    for (i = 0; i < x.length; i++) {
                  
                        if (x[i] == buscar) {
                            flag = 1;
                            JOptionPane.showMessageDialog(null, "El numero se encuentr en la posicion " + i);
                          break;
                            // se colocó la variable de iteración "i" que muestra la posición del valor buscado
                        }
                    
                    }
                  
                    if (flag ==0) {// se cambió el tipo de dato de boolean a entero.
                        JOptionPane.showMessageDialog(null, "El numero que buscas, no esta en el arreglo");
                    }
                    break;
                case 7:
                    for (i = 0; i < x.length; i++) {
                        for (j = 0; j < x.length - 1; j++) {
                            if (x[j] > x[j + 1]) {
                                int tem = x[j];
                                x[j] = x[j + 1];
                                x[j + 1] = tem;

                            }
                        }
                    }

                    for (i = 0; i < x.length; i++) {
                        JOptionPane.showMessageDialog(null, x[i] + " ");
                    }
                    break;

                case 8:
                    for (i = 0; i < x.length; i++) {
                        for (j = 0; j < x.length - 1; j++) {
                            if (x[j] < x[j + 1]) {
                                int tem = x[j];
                                x[j] = x[j + 1];
                                x[j + 1] = tem;

                            }
                        }
                    }

                    for (i = 0; i < x.length; i++) {
                        JOptionPane.showMessageDialog(null, x[i] + " ");
                    }
                    break;
            }
        } while (menu != 9);
    }

}
