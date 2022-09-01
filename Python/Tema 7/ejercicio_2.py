import time

hora = time.strftime('%H') 
minutos = time.strftime('%M') 
resta_hora = 18 - int(hora)
resta_minutos = 59 - int(minutos)


if int(hora) >= 19:
    print('Podemos irnos a casa.')
else:
    print (f'Quedan {resta_hora} horas y {resta_minutos} minutos para irnos a casa.')