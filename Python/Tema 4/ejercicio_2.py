numero_inicial = int(input('Escribe un número inicial: '))
numero_final = int(input('Escribe un número final: '))

while numero_final <= numero_inicial:
    numero_final = int(input('El número final debe ser mayor al inicial: '))

for number in range(numero_inicial, numero_final):
    if number % 2 != 0:
        print(number)