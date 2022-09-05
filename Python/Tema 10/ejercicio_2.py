from tkinter import *

root = Tk()
root.title('Cursos')
label = Label(root, text='Selecciona un curso:')
label.pack()

cursos = Listbox(root)

for item in ['Python', 'Java', 'PHP', 'Ruby', 'C++', 'Javascript', 'Cobol', 'Swift', 'Kotlin']:
 cursos.insert(END, item)
cursos.pack()

root.mainloop()