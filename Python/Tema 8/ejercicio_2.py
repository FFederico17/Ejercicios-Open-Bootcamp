import pickle

class Vehiculo:
   
    def __init__(self, marca, modelo, color):
        self.marca = marca
        self.modelo = modelo
        self.color = color

coche = Vehiculo('Toyota', 'Corolla', 'Negro')

f = open('coches', 'wb')
pickle.dump(coche, f)
f.close()

f = open('coches', 'rb')
mi_coche = pickle.load(f)
f.close()