import java.util.Stack; //clase Stack del paquete java.util que nos permite trabajar con pilas en Java.


public class PilaNumeros //Creamos la  clase llamada PilaNumeros que contendrá nuestro programa.

{

    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<Integer>();//creamos una instancia de Stack llamada pila que representa nuestra pila de números enteros.
        
        pila.push(10);//Usando el método push, agregamos los números 10, 20, 30 y 40 a la pila.
        pila.push(20);
        pila.push(30);
        pila.push(40);
        
        System.out.println("Elementos de la pila: " + pila); 
        
        // Sacamos un elemento de la pila
        int elemento = pila.pop();//Usamos el método pop para sacar un elemento de la pila y lo almacenamos en la variable elemento.
        System.out.println("Elemento sacado de la pila: " + elemento);
        
        System.out.println("Elementos de la pila después de sacar uno: " + pila);//Imprimimos el elemento sacado de la pila en la línea de salida.
// EJERCICIO; saca 4 elementos ahora y verifica que ocurre
   

    }

}


