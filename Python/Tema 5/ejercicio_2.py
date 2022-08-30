def numero_primo():
    numero: int = int(input("Introduce un número entero: "))

    if numero > 1:
        for x in range (2, numero + 1):
            if numero % x == 0 and x != numero:
                print (f'El número {numero} no es primo, ya que es divisible entre {x}.')
                break
            elif x == numero:
                print (f'El número {numero} es primo.')
    else:
        print(f'{numero} no es primo, ya que siempre son mayores a 1.')

numero_primo()