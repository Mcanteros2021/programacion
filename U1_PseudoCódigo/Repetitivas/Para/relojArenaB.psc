Algoritmo RelojArenaB
	Definir tam,x,c Como Entero
	
	Repetir 
		Escribir "Introduce el tamaño del Reloj. Debe ser impar y mayor que 3"
		Leer tam	
	Hasta Que  tam %2 = 1 Y tam >= 3
	
	
	Para x<-0 Hasta tam-1  Hacer
		
		//Primera Mitad
		Si (x < (tam/2)) Entonces
			//Los espacios
			SI x>0 ENTONCES 
				Para c<-0 Hasta x-1
					Escribir sin saltar "-"
				FinPara
			FinSi
			
			Para c<-0 Hasta tam-2*x-1
				Escribir sin saltar "*"
			FinPara
			
		SiNo
			
			SI x<tam-1 ENTONCES 
				Para c<-0 Hasta tam-2-x
					Escribir sin saltar "-"
				FinPara
			FinSi
			
			Para c<-0 Hasta tam-2*x-1
				Escribir sin saltar "*"
			FinPara
				
			
		FinSi
		
		Escribir ""
	Fin Para
	
FinAlgoritmo
