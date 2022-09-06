import sqlite3

conn = sqlite3.connect('alumnos.db')
cursor = conn.cursor()

cursor.execute('''CREATE TABLE IF NOT EXISTS alumnos (
    id INTEGER PRIMARY KEY,
    nombre TEXT NOT NULL,
    apellido TEXT NOT NULL)''') 

cursor.execute("INSERT INTO alumnos VALUES (1, 'María', 'González')")
cursor.execute("INSERT INTO alumnos VALUES (2, 'José', 'López')")
cursor.execute("INSERT INTO alumnos VALUES (3, 'Marcos', 'Pérez')")
cursor.execute("INSERT INTO alumnos VALUES (4, 'León', 'Rodríguez')")
cursor.execute("INSERT INTO alumnos VALUES (5, 'Lorena', 'Páez')")
cursor.execute("INSERT INTO alumnos VALUES (6, 'Valentino', 'Otto')")
cursor.execute("INSERT INTO alumnos VALUES (7, 'Carla', 'Estévez')")
cursor.execute("INSERT INTO alumnos VALUES (8, 'Victoria', 'Aspiz')")
cursor.execute("INSERT INTO alumnos VALUES (9, 'Felipe', 'Torres')")
cursor.execute("INSERT INTO alumnos VALUES (10, 'Ámbar', 'Cáceres')")

conn.commit()

cursor.execute("SELECT * FROM alumnos WHERE nombre = 'León'")

data = cursor.fetchall()

print(data)

cursor.close()
conn.close()