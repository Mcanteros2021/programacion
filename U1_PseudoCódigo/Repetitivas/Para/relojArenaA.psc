Algoritmo reloj_arenaA
	Definir tam,x,c Como Entero
	
	Repetir 
		Escribir "Introduce el tamaño del Reloj. Debe ser impar y mayor que 3"
		Leer tam	
	Hasta Que  tam %2 = 1 Y tam >= 3
	
	
	Para x<-0 Hasta tam-1  Hacer
		
		Para c<-0 Hasta tam-1 Hacer
			SI x=0 O x=tam-1 O (c>=x Y x+c<=tam-1) O (c<=x Y x+c>=tam-1) Entonces
				Escribir Sin Saltar "*"
			SINO 
				Escribir Sin Saltar "-"
			FinSi
		FinPara
		Escribir ""
	Fin Para
	
FinAlgoritmo
