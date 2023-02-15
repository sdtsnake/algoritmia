# algoritmia
Este repositorio tiene como porposito repasar la algoritmia guiado por un magister de la universida del valle y un "ingeniero" de la universidad camacho con el fin de afianzar conceptos de algorimia.

# Tipos de datos atomicos

Son aquellos que no se pueden dividir en elemento mas pequeños, estos se dividen en : <br>
<b> Los ensenciales
- Numero discretos : int short long
- No discretos/"continuos" : float doble

<b> Los no esenciales 
- char

<p>Nota : </p> Se considera no esencial el char por a la final una caracter tiene su representacion numerica que puede ser suplidad con los numeros discretos.

# Tipos de datos compuestos

Son loque requieren para la representacion de inforamcion compleja, estos se dividen en : <br>

<b>Los esenciales
- Arreglos -> Estos una secuencia enumerable de tamaño fijo de elementos del mismo tipo
- Registros -> Es un conjunto enumerable de tamañp fijo con elementos diversos y etiquetas las cuales no se pueden repetir

<b> Los no esenciales
- pilas -> Es una estructura de datos en la que se puede agregar y eliminar elementos solo en un extremo, el último en entrar es el primero en salir.
- colas ->  Es una estructura de datos en la que se puede agregar elementos en un extremo y eliminarlos en el otro extremo, el primero en entrar es el primero en salir.
- listas -> Es una estructura de datos lineal que permite agregar y eliminar elementos en cualquier posición.
- tuplas -> Es una estructura de datos que contiene un conjunto fijo de elementos, que no pueden ser modificados.
- set -> Es una estructura de datos que contiene elementos únicos.
- String -> Es un tipo de datos que representa una cadena de caracteres.
- Map -> Es una estructura de datos que asocia claves con valores y permite buscar y acceder a ellos de forma eficiente.
- arbloles -> Es una estructura de datos jerárquica que representa relaciones de padre-hijo entre elementos.
- Grafos -> Es una estructura de datos que representa relaciones entre nodos o vértices con enlaces o aristas.

<p>Nota : <p> Se consideran no esenciales porque casi todas estas estrucuruas se pueden manejar con registros.

# Funciones y procedimientos
Ambos son bloques de codigo que realizan una tarea especifica y ayuda a mejorar la legibilidad del codigo permitiendo las reutilizacion y simplificacion de las tareas su diferencia radica en que las funciones retornan un valor y los procedimientos no.

<p> Ejercicios: <br>

Crear una clase Número que tengan los siguientes metodos estaticos.

- Implementar funcion minimo
- Implementar funcion par (boolean)
- Implementar funcion impar (boolean)
- Implementar funcion exponente base y exponente

Crear una clase arreglos que tenga los siguientes metodos estaticos.

- Implementar una funcion que sume los valores de un arreglo
- Implementar una funcion que multiplique los valores de un arreglo por otro valor
- Implementar funcion que retorne cuantos pares hay asumiendo que el cero es par
- Implementar funcion que retorne cuantos impares hay asumiendo que el cero es par
- Implementar funcion que partiendo un número N y un arrelo "A" me dé como resultado 2 arreglos "B" y "C" donde "B" esta compuesto por los numero de "A" que sean menores que N y "C" esta compuesto por los numeros de "A" que sean mayores o iguales a N respues es un arreglo de arreglos

<p>Nota : </p> Ambos ejercicios deben contar con pruebas unitarias y aplicando TDD. 

Tips : <br>

1. pensar en los casos extremos
2. Pensar en casos representavivos teniendo en cuenta que son excluyentes

