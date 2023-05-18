class PilaNumeros: #Definimos una clase llamada PilaNumeros, que representa nuestra pila de números enteros.


    def __init__(self):# En el método __init__, inicializamos la pila como una lista vacía.

        self.items = []

    def esta_vacia(self):  #El método esta_vacia verifica si la pila está vacía, comprobando si la lista items está vacía.

        return self.items == []

    def push(self, item): #El método push agrega un elemento a la pila. Utilizamos el método append de la lista para agregar el elemento al final de la lista items.

        self.items.append(item)

    def pop(self): # El método pop remueve y devuelve el último elemento agregado a la pila, utilizando el método pop de la lista.

        return self.items.pop()

    def tamano(self): #El método tamano devuelve el tamaño de la pila, es decir, la longitud de la lista items.

        return len(self.items)


pila = PilaNumeros() #Creamos una instancia de PilaNumeros llamada pila.


# Agregamos los números a la pila usando el método push
pila.push(1)
pila.push(2)
pila.push(3)
pila.push(4)

# Imprimimos los elementos de la pila ,  accediendo a la lista items de la pila.

print("Elementos de la pila: ", pila.items)


elemento = pila.pop()# Sacamos un elemento de la pila usando el método pop, y lo almacenamos en la variable elemento.

print("Elemento sacado de la pila: ", elemento)  #Imprimimos el elemento sacado de la pila.


# Imprimimos los elementos de la pila después de sacar uno
print("Elementos de la pila después de sacar uno: ", pila.items) #Imprimimos los elementos de la pila después de sacar uno, nuevamente accediendo a la lista items de la pila.

# ejercicio : Verfica que ocurre si sacas 4 elementos en este punto del codigo 











