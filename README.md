# Ejercicio 02 - Hackademy
---
## 10,001vo numero primo
---
 Enlistando los primeros seis números primos:
2,3,5,7,11 y 13, podemos ver que el sexto numero primo es el 13.  
Cual es el 10,001 numero primo?

---
# Como resolver el problema

Un numero primo es aquel que se puede dividir solamente entre el numero 1 y si mismo.

Para encontrar los números primos usamos el **algoritmo criba de Eratóstenes**, en este caso hacemos un método que recibe un numero el cual sera comparado con diferentes condiciones para saber si es un numero primo o no.

```java
public static boolean EncontrarNumeroPrimo(long numero) {
```
Como 0 y 1 no son números primos los ignoramos

```java
        if( numero == 0 || numero == 1 ) {
            return false;
        }
```
2 es el primer numero primo
```java
        if( numero ==  2 ) {
            return true;
        }
```
Comenzamos por el 2 y tachamos todos los múltiplos de 2
```java
        if( numero%2 == 0 ){ 
            return false;
        } 
```
Luego revisamos los números impares.  
Cuando se encuentra un numero primo se tachan todos sus múltiplos y así sucesivamente
```java
        for( int i = 3; i*i <= numero; i+=2 ) {
            if( numero % i == 0 ) { 
               return false;
        }
```
Cualquier numero que no coincida con alguna de las condiciones es un numero primo
```java
        return true;
    }
```
Ya con el método para encontrar números primos hasta la posición en que queramos encontrar
```java
    public static void EncontrarPrimoEnPosicion(int posicion) {
        
        int x;
```
Empezamos a buscar desde el primer numero primo, es decir, la primer posición
```java
int i = 1;
```
En este caso el primer numero primo es 2, por lo tanto x=2 y en cada iteración incrementamos el numero para pasarlo al método EncontrarNumeroPrimo()
```java
        for( x = 2;; x++ ) {
            if(EncontrarNumeroPrimo(x)) {
```
Cuando se encuentre el 10,001 numero primo rompemos la iteración de lo contrario seguimos buscando
```java
if(i == posicion) {
                    break;
                }
                i++;
            }
        }
```
Mostramos el 10,001 numero primo
```java
 System.out.println("El "+i+" numero primo es: "+x);
    }
```
Finalmente pasamos en el parametro del metodo la posicion en que queremos encontrar el numero primo
```java
    public static void main(String[] args) {
        EncontrarPrimoEnPosicion(10001);
    }
```
En este caso el 10,001vo numero primo es: **104743**
