Práctico 7: Estructuras combinadas


1) Se tienen cargados en el archivo Equipos.ser los datos referidos a equipos participantes de un torneo deportivo. El archivo no se encuentra ordenado bajo ningún criterio. Cada registro del archivo contiene: nombre (de tipo string), puntaje (integer).
Se pide que implemente las clases y métodos necesarios para generar un árbol ARB_EQUIPOS en memoria principal con todos los datos del archivo teniendo en cuenta lo siguiente:
El árbol debe estar ordenado alfabéticamente por nombre del equipo.
Si ingresa un equipo con un nombre que ya fue incorporado al árbol, no debe incorporarse.
Los nodos del árbol deben tener un atributo adicional de tal manera que los equipos puedan ser listados ascendentemente por puntaje mediante ese vínculo (armando una lista simple). Ese nuevo orden es accedido por un atributo inicial ORDEN_PUNTAJE.

NOTAS: 
El árbol debe estar ordenado en todo momento por nombre de equipo.
La lista que forman los nodos del árbol a partir de ORDEN_PUNTAJE y por el vínculo adicional también debe estar ordenada correctamente por puntaje en todo momento (ante cada nuevo equipo  que se agrega). 
No puede usar estructuras auxiliares.  
Debe definir: clases, constantes, atributos y métodos.
Asuma que el archivo ya existe y está cargado.
Tampoco debe imprimir el resultado.


2) Se tiene ya cargada en memoria una estructura con toda la información de los números de legajo [integer] de los alumnos de Ingeniería de sistemas con los códigos de materias [integer] y notas de finales [real]. Dicha estructura es un árbol con los números de legajo ordenados ascendentemente y cada nodo posee además un puntero adicional a una lista simple en la que cada nodo posee código de materia y nota. Esta lista estará siempre ordenada ascendentemente por código de materia. Están almacenadas todas las notas de finales, aprobados o no, por lo tanto la lista posee códigos de materia repetidos cuando un alumno intentó dar más de una vez la materia.
Dada esta estructura (árbol con listas) y un archivo con las notas de la última fecha de finales (que aún no están incorporadas en la estructura) en el que cada registro posee: legajo, codigo de materia y nota, debe agregar todos los registros del archivo en la estructura teniendo en cuenta que puede haber legajos que aún no están en el árbol y que la nota se debe agregar como última de ese código de materia (si ya tiene desaprobados) o como única nota de ese código, incorporando el nodo y manteniendo el orden con los otros códigos existentes.
Realice el código del programa completo, con todas las clases que considere, definiciones de constantes, atributos y métodos.
Notas: a) No tiene que implementar la generación/carga de la estructura ni del archivo ni imprimir ningún resultado. b) No puede utilizar estructuras auxiliares. c) Debe mantener el orden del árbol y de la lista en todo momento.
Ejemplo de estructura en memoria: En este ejemplo el alumno con número de legajo 4 rindió primero la materia 7 sacando un 2 y luego sacó un 4, también rindió la materia con código 81 y sacó un 8.



3) Se tiene un árbol ya cargado con datos de usuarios, cada nodo tiene nro_usuario[int] y nombre[string]. El árbol está apuntado por el atributo arbol_nro y todos sus nodos están ordenados por nro_usuario con sus punteros (ant_nro y sig_nro). Cada nodo además de esos dos atributos posee dos más (ant_nombre y sig_nombre) que están en nil. Se pide que defina un atributo más llamado arbol_nombre de este mismo tipo y que a partir de ese atributo arme un árbol con todos los nodos que estén entre (min_nro y max_nro, incluyéndolos, pedidos al usuario) ordenado por nombre utilizando los atributos ant_nombre y sig_nombre.
Notas: 
a) Debe hacer todo el código, sólo asumiendo que el árbol ya está cargado.
b) los nro_usuario no se repiten pero los nombre si pueden repetirse y los iguales tienen que quedar junto con los sig_nombre.
c) No debe recorrer nodos del árbol innecesariamente.

4)Se tiene ya cargada en memoria una estructura con toda la información estudiantes y materias.  Dicha estructura es un árbol con los números de legajo ordenados ascendentemente y cada nodo posee (además de los dos punteros de árbol), un puntero adicional a una lista simple de notas, y otro puntero  a un nodo de árbol inicialmente en nil que permitirá recorrer al árbol como una lista simple ordenada ascendentemente por nota Máxima. Cada lista de notas posee código de materia(no se repite)  y nota.

Toda esta estructura está en una clase Estudiantes que tiene dos punteros:
puntero Legajo:  apunta al primer nodo del árbol ordenado por legajo
puntero OrdenNotaMaxima: apunta al primer nodo según orden nota máxima(inicialmente en nil)

Se pide actualizar los punteros que permitirán crear una lista simple ordenada ascendentemente para todos los  nodos del árbol mayores estrictos a un legajoMax (ingresado por usuario)  según sea la máxima nota de cada estudiante.

Suponer la estructura ya cargada que se puede recorrer por legajo. No se necesita hacer métodos de impresión. Escribir las estructuras de cada clase y sólo los métodos necesarios para resolver el problema, pueden usar get y set para acceder a los atributos SIN definirlos. No se pueden usar estructuras auxiliares.
