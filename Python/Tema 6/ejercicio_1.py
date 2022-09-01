class Vehiculo():
    
    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas

    def __str__(self):
        return 'Color {}, {} ruedas y {} puertas'.format(self.color, self.ruedas, self.puertas) 

class Coche(Vehiculo):
    
    def __init__(self, color, ruedas, puertas, velocidad, cilindrada):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas
        self.velocidad = velocidad
        self.cilindrada = cilindrada

    def __str__(self):
        return "Color {}, {} ruedas, {} puertas, {} km/h, {} cc".format( self.color, self.ruedas, self.puertas, self.velocidad, self.cilindrada )


mi_coche = Coche('Rojo', 4, 3, 150, 1400)
print(mi_coche)