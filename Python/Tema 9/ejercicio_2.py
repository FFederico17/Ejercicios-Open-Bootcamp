from functools import reduce

lista_numeros = [29, 66, 12, 81, 4, 7, 53, 142, 99] 
numeros_impares = filter(lambda x: x % 2, lista_numeros)
numeros_impares = list(numeros_impares)

print(numeros_impares)

resultado = reduce(lambda a,b: a+b, numeros_impares)
print(resultado)