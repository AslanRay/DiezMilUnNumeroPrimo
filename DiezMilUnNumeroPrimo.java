/**
 * Enlistando los primeros seis numeros primos:
 * 2,3,5,7,11 y 13, podemos ver que el sexto numero primo
 * es el 13.
 * Cual es el 10,001 numero primo?
 */
package diezmilunnumeroprimo;

import java.util.*;


public class DiezMilUnNumeroPrimo {

    public static void main(String[] args) {
        //Pasamos en el parametro del metodo la posicion en que
        //queremos encontrar el numero primo
        EncontrarPrimoEnPosicion(10001);
    }
    
    // Un numero primo es aquel que se puede dividir solamente entre
    // el numero 1 y si mismo
    
    //Algoritmo criba de erastotenes
    public static boolean EncontrarNumeroPrimo(long numero) {
        // Como 0 y 1 no son numeros primos los ignoramos
        if(numero == 0 || numero == 1) {
            return false;
        }
        // 2 es el primer numero primo
        if(numero ==  2) {
            return true;
        }
        // comenzamos por el 2
        // y tachamos todos multiplos de 2
        if( numero%2 == 0 ){ 
            return false;
        } 
        //Luego revisamos los numeros impares
        //Cuandos se encuentra un numero primo se tachan todos sus 
        //multiplos y asi sucesivamente
        for(int i = 3; i*i<=numero; i+=2) {
            if(numero%i==0) { return false;
        }
    }
        return true;
    }
    
    //Generar numeros primos
    public static void EncontrarPrimoEnPosicion(int posicion) {
        
        int x;
        // Empezamos a buscar desde el primer numero primo
        int i = 1;
        // En este caso el primer numero primo es 2, por lo tanto x=2
        // y en cada iteracion incrementamos el numero para pasarlo 
        // al metodo EncontrarNumeroPrimo()
        for(x = 2;;x++) {
            if(EncontrarNumeroPrimo(x)) {
                //Cuando se encuentre el 10,001 numero primo rompemos la
                //iteracion de lo contrario seguimos buscando
                if(i == posicion) {
                    break;
                }
                i++;
            }
        }
         System.out.println("El "+i+" numero primo es: "+x);
    }
}
