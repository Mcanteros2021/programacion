Algoritmo ejercicio6
	//Ejercicio4-6: Prepara un programa que pida al usuario tres n�meros y diga cu�l 
	//es el mayor de los tres.
	Definir n1,n2,n3 Como Entero
	
	Escribir "Introduce el primer n�mero"
	Leer n1
	
	Escribir "Introduce el segundo n�mero"
	Leer n2
	
	Escribir "Introduce el tercer n�mero"
	Leer n3	
	
	SI n1 > n2 Entonces
		SI n1 > n3 Entonces
			Escribir n1," es el mayor"
		SiNo
			Escribir n3, " es el mayor"
		FinSi
	SiNo
		SI n2 > n3 Entonces
			Escribir n2," es el mayor"
		SiNo
			Escribir n3, " es el mayor"
		FinSi		
	FinSi
	
FinAlgoritmo
