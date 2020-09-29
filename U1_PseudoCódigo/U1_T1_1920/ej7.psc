Algoritmo ejercicio7
	//Desarrolla un programa que simule el comportamiento de una moneda que 
	//tiras al aire. Debe mostrar aleatoriamente "cara" o "cruz". (random)
	Definir tirada Como Entero
	Definir usuario Como Caracter
	
	Escribir "Introduce cara o cruz"
	Leer usuario
	
	tirada = azar(2)
	
	SI tirada = 1 Y usuario = "cara" O tirado = 0 Y usuario="cruz" Entonces
		Escribir "Ha acertado"
	SiNo
		Escribir "Has fallado"
	FinSi
	
FinAlgoritmo
