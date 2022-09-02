f = open('mi_fichero.txt', 'w')
f.write('¡He creado mi primer fichero!\n')
f.close()

f = open('mi_fichero.txt', 'r+')
f.readline()
f.write('Aquí escribo mi segunda línea.\n')
f.close()
