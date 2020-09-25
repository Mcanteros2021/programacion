Algoritmo ejercicio5
	//Crea un programa que pida al usuario dos números y 
	//muestre su división si el segundo no es cero, o un mensaje 
	//de aviso en caso contrario.
	
	Definir dividendo COMO real
	Definir divisor COMO real	
	
	Escribir "Introduce el dividendo"
	Leer dividendo
	
	Escribir "Introduce el divisor"
	Leer divisor
	
	SI divisor = 0 Entonces
		ESCRIBIR "NO SE PUEDE DIVIDIR POR CERO"
	SiNo
		ESCRIBIR "EL resultado es ", dividendo/divisor
	FinSi
FinAlgoritmo
