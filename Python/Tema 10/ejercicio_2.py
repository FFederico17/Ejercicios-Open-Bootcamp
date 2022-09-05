import tkinter

root = tkinter.Tk()
root.geometry('250x250')
root.title('Cursos disponibles')

cursos_lb = tkinter.Label(root, text='Selecciona un curso:').place(x=20, y=10)

cursos = tkinter.Listbox(root)
cursos.place(x=20, y=40)
cursos.insert(0, 'Python')
cursos.insert(1, 'Java')
cursos.insert(2, 'Ruby')
cursos.insert(3, 'CSS')
cursos.insert(4, 'Javascript')
cursos.insert(5, 'C++')
cursos.insert(6, 'Cobol')
cursos.insert(7, 'PHP')

root.mainloop()