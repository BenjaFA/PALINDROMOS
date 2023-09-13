# PALINDROMOS
trabajo grupal

Integrantes: Benjamin Fernandez - Yoandri Villarroel

------------------- Paso 1 ------------------------

¿Qué hace el método?

R: Este metodo toma una cadena de texto en la entrada y en la salida retorna la comparacion entre la cadena invertida y la cadena ingresada.

¿Cómo lo hace?
R: primero crea una variable "resultado" siendo una cadena vacia, luego cambia el resultado diviendo la cadena con el .split(''), luego usa el reverse() para que la cadena dividida se invierta de posicion y luego lo vuelven a unir usando el .join(''). Por ultimo la cadena se compara con el resultado, siendo que si estos son iguales entonces seria un palindromo o en caso contrario, no lo seria.
