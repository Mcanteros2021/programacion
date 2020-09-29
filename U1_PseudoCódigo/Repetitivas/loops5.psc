Algoritmo sin_titulo
	Definir n1,n2,result,intentos Como Entero
	
	
	n1 = azar(101)
	n2 = azar(101)
	
	Escribir "Suma es ",n1+n2
	
	Escribir "Adivine la suma"
	Leer result
	intentos = 1
	
	Mientras result  <> n1+n2 Y intentos < 5 Hacer
		Escribir "Uppsss, prueba otra vez"
		Escribir "Adivine la suma"
		Leer result
		intentos = intentos+1
	FinMientras
	
	SI result = n1+n2 Entonces
		Escribir "Has acertado en ",intentos," intento"
	SiNo
		Escribir "Has consumido todos los intentos:", intentos
	FinSi
	
FinAlgoritmo
