Algoritmo ejercicio4
	//Ejercicio4-4: Haz un programa que pida al usuario 
	//dos números y diga cuántos de ellos son positivos.
	Definir n1 COMO entero
	Definir n2 COMO entero
	Definir num_positivos Como Entero
	
	Escribir "Introduce el primer número"
	Leer n1
	
	Escribir "Introduce el segundo número"
	Leer n2
	
	num_positivos=0
	
	SI n1>0 Entonces
		num_positivos = num_positivos+1
	FinSi
	
	SI n2>0 Entonces
		num_positivos = num_positivos+1
	FinSi
	
	Escribir "El número de positivos es ",num_positivos
	
FinAlgoritmo
