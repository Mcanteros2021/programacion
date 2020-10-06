Algoritmo dibujar_alternas_2
	Definir tam,f Como Entero
	
	Repetir 
		Escribir "Introduce el tamaño. Mayor que 3 e impar"
		Leer tam
	Hasta Que tam>3 Y tam%2=1
	
	Para f<-1 Hasta tam Hacer
		SI  f%3<>1 ENTONCES 
			Escribir "XXXXXXX"
		SINO 
			Escribir "XX---XX"
		FinSi		
	Fin Para
FinAlgoritmo
