Algoritmo multiplos8
	Definir num,multiplos Como Entero
	
	Escribir "Introduzca el número inicial"
	Leer num
	
	multiplos = 0
	
	Mientras multiplos<=10
		
		SI num%8 = 0 Entonces
			multiplos = multiplos+1
			Escribir num, " es múltiplo de 8"
		FinSi
		
		num = num +1
		
	FinMientras
	
	
	
	
FinAlgoritmo
