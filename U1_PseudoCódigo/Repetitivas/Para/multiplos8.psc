Algoritmo multiplos8
	Definir num,multiplos Como Entero
	
	Escribir "Introduzca el n�mero inicial"
	Leer num
	
	multiplos = 0
	
	Mientras multiplos<=10
		
		SI num%8 = 0 Entonces
			multiplos = multiplos+1
			Escribir num, " es m�ltiplo de 8"
		FinSi
		
		num = num +1
		
	FinMientras
	
	
	
	
FinAlgoritmo
