Algoritmo dibujar_alternas
	Definir tam,f Como Entero
	
	Repetir 
		Escribir "Introduce el tama?o. Mayor que 3 e impar"
		Leer tam
	Hasta Que tam>3 Y tam%2=1
	
	Para f<-1 Hasta tam Hacer
		SI  f%2=1 ENTONCES 
			Escribir "XXXXXX"
		SINO 
			Escribir "X----X"
		FinSi		
	Fin Para
	
FinAlgoritmo
