Algoritmo ejercicio7
	//Actividad 1. Realiza un programa que pida al usuario
	//un importe en pesetas, y escriba su equivalencia en euros, 
	//teniendo en cuenta que:ZSi la cantidad introducida es negativa, el programa debe mostrar un mensaje de error: "El valor en pesetas no es correcto"
	//1 euro = 166,386 pesetas
	Definir pesetas Como Entero
	
	Escribir "Introduce la cantidad pesetas"
	Leer pesetas
	
	SI pesetas <= 0 Entonces
		Escribir "La cantidad debe ser positiva"
	SINO 
		Escribir pesetas, "pesetas son ", pesetas/166.386, "€"
	FinSi
	
FinAlgoritmo
