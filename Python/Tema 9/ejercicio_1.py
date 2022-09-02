paises = input('Ingresa tantos países como gustes (separados por comas): ')

lista_paises = list(set(letra.strip() for letra in paises.split(',')))
lista_paises.sort()
print(lista_paises)