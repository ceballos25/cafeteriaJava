# cafeteriaJava

# Desarrolladores

Leider Merchan Gutierrez
Lucas Enrique Muñoz Ospina
Cristian Camilo Ceballos Marin

# ¿Por qué usas double para el precio y no int? ¿Qué pasaría si declaras el precio como int y le asignas 3.50?

Respuesta: Porque el precio se maneja decimales y en entero no se maneja, además perdemos precisión y pérdida de datos lo más seguro en precios es diempre manejar decimal (DOUBLE), si definimos una variable como INT y a su valor le asignamos un DOUBLE, da error de ejecución

## Pregunta: ¿Qué operador usaste para determinar si aplica el descuento? ¿Qué tipo de dato devuelve ese operador?

Respuesta: Usamos el operador relaconal descuento > mayor que y devuelve un BOOL