# Introducción a la programación II - Spotreefy

## Descripción del Sistema
Spotreefy es un sistema de gestión de música y canciones que permite manejar listas de reproducción y seguidores para múltiples usuarios.

## Estructura del Menú

### Primer Nivel
1. **Login**
   - Requiere nombre de usuario y password
   - Da acceso al segundo nivel de menú

2. **Nuevo Usuario**
   - Solicita nombre y password
   - Verifica que el nombre no exista
   - Password debe tener mínimo 6 caracteres

3. **Ver Usuarios existentes**
   - Muestra listado alfabético de usuarios

4. **Salir**
   - Termina el programa
   - Guarda información en archivos

### Segundo Nivel
Muestra:
- Nombre del usuario
- Listas de reproducción propias (orden alfabético)
- Listas seguidas (ordenadas por usuario y nombre)

Opciones:
1. **Agregar canción**
   - Requiere título y autor
   - Verifica que no exista el título
   - Agrega al árbol y lista del autor

2. **Crear lista de reproducción**
   - Solicita nombre de playlist
   - Verifica que no exista para el usuario
   - Crea lista vacía

3. **Agregar canción por título**
   - Requiere nombre de playlist y título
   - Verifica existencia de ambos
   - Evita duplicados

4. **Agregar canción por autor**
   - Solicita playlist y autor
   - Muestra canciones del autor
   - Permite selección y agregado

5. **Eliminar lista propia**
   - Elimina playlist y suscripciones

6. **Incluir lista de otro usuario**
   - Muestra usuarios y sus listas
   - Permite seguir nueva lista

7. **Salir al primer nivel**

## Estructuras de Datos

### ArbUsuarios
- Árbol binario ordenado por nombre
- Nodos: 
  - Nombre [string8]
  - Password [string8]
  - ListasPropias [puntero]
  - ListasSeguidos [puntero]

### ArbCanciones
- Árbol binario ordenado por título
- Nodos:
  - Título [string30]
  - Lista circular de canciones del mismo autor

### ListaAutores
- Lista simple ordenada por nombre
- Nodos:
  - Nombre [string8]
  - Puntero siguiente
  - Puntero a Canción [ArbCanciones]

### ListasPropias
- Lista simple ordenada alfabéticamente
- Nodos:
  - Nombre Lista [string8]
  - Puntero a SubListaCanciones

### SubListaCanciones
- Lista simple sin orden
- Nodos:
  - Puntero siguiente
  - Puntero a Canción [ArbCanciones]

### ListasSeguidos
- Lista simple ordenada por usuario y nombre lista
- Nodos:
  - NombreUsuario [string8]
  - NombreLista [string8]

## Archivos del Sistema

### ArchUsuarios
- Registros: Nombre y Password
- Generado desde ArbUsuarios en PreOrder

### ArchCanciones
- Registros: Título y Nombre del Autor
- Generado desde ListaAutores y ArbCanciones

### ArchListasPropias
- Registros:
  - Usuario [string8]
  - Lista [string8]
  - Título canción [string30]

### ArchListasSeguidas
- Registros:
  - Usuario [string8]
  - Usuario seguido [string8]
  - Nombre lista [string8]