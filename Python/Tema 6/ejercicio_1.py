class Vehiculo:
    color = ''
    ruedas = 0
    puertas = 0

class Coche(Vehiculo):
    velocidad = 0
    cilindrada = 0

c = Coche()
c.color = 'Azul'
c.ruedas = 4
c.puertas = 3
c.velocidad = 120
c.cilindrada = 1.2

print(f'Color del coche: {c.color}.')
print(f'Cantidad de ruedas: {c.ruedas}.')
print(f'Cantidad de puertas: {c.puertas}.')
print(f'Velocidad máxima: {c.velocidad}.')
print(f'Cilindrada: {c.cilindrada}.')