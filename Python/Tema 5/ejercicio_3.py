def anio_bisiesto():
    anio_bisiesto: int = int(input("Introduce un número entero positivo: "))

    if anio_bisiesto % 4 == 0 and anio_bisiesto != 0:
        print(f'{anio_bisiesto} es un año bisiesto.')
    elif anio_bisiesto == 0:
        print(f'El año {anio_bisiesto} no existe en el calendario.')
    else:
        print(f'{anio_bisiesto} no es un año bisiesto.')
    

anio_bisiesto()