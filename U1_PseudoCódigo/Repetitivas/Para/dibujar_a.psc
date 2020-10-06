Algoritmo dibujar_A
	
	Definir tam,f Como Entero
	
	Repetir 
		Escribir "Introduce el tamaño. Mayor que 3 e impar"
		Leer tam
	Hasta Que tam>3 Y tam%2=1
	
	Para f<-1 Hasta tam Hacer
		SI (f=1) O (f=trunc(tam/2)+1) ENTONCES 
			Escribir "XXXXX"
		SINO 
			Escribir "X---X"
		FinSi		
	Fin Para
	
FinAlgoritmo
