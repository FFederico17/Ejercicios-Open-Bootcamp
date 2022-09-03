import tkinter
from tkinter import ttk

window = tkinter.Tk()
radio_value = tkinter.IntVar()

def reiniciar(event):
    radio_value.set(None)

button_1 = tkinter.Radiobutton(window, text='Verano',
                             variable=radio_value, value=1) 
button_2 = tkinter.Radiobutton(window, text='Otoño',
                             variable=radio_value, value=2) 
button_3 = tkinter.Radiobutton(window, text='Invierno',
                             variable=radio_value, value=3)
button_4 = tkinter.Radiobutton(window, text='Primavera',
                             variable=radio_value, value=4)
                                                       
button_1.grid(column=0, row=0)
button_2.grid(column=0, row=1)
button_3.grid(column=0, row=2)
button_4.grid(column=0, row=3)


reset_button = tkinter.Button(window, text='Reiniciar')
reset_button.grid(column=1, row=4)
reset_button.bind('<Button-1>', reiniciar)

window.mainloop()