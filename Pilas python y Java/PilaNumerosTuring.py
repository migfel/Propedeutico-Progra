class PilaNumerosTuring:
    def __init__(self):
        self.pila = []

    def esta_vacia(self):
        return len(self.pila) == 0

    def push(self, elemento):
        self.pila.append(elemento)

    def pop(self):
        if not self.esta_vacia():
            return self.pila.pop()
        else:
            raise Exception("La pila está vacía")

# Crear una instancia de la pila
pila = PilaNumerosTuring()

# Agregar números a la pila
pila.push(10)
pila.push(20)
pila.push(30)
pila.push(40)

# Sacar números de la pila
while not pila.esta_vacia():
    numero = pila.pop()
    print(numero)
