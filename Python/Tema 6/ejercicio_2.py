class Alumno():

    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota

    def evaluacion(self):
        if self.nota >= 7 and self.nota <= 10:
            print(f'Felicitaciones {self.nombre}, has aprobado. Tu nota es {self.nota}.')
        elif self.nota >= 0 and self.nota <7 :
            print(f'Lo siento, {self.nombre}, has desaprobado. Tu nota es {self.nota}.')
        else:
            print(f'{self.nombre}, la nota ingresada no es válida. Vuelve a intentarlo.')

alumno_1 = Alumno('María Hernández', 8)
alumno_1.evaluacion()
alumno_2 = Alumno('José Flores', 5)
alumno_2.evaluacion()
alumno_3 = Alumno('Mario López', 19)
alumno_3.evaluacion()




