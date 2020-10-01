Algoritmo rectangulo_diagonales
	Definir altura, anchura, f,c Como Entero
	
	Repetir 
		Escribir "Introduce la altura: Impar y mayor que 5"
		Leer altura
	Hasta Que  altura>=5 Y altura%2=1	
		
	Para f<-1 Hasta altura Hacer
		Para c<-1 Hasta altura Hacer
			SI f=1 O f=altura O c=1 O c=altura O f=c O f+c = altura +1 entonces
				Escribir sin saltar "*"
			SiNo
				Escribir sin saltar "-"
			FinSi
		FinPara
		
		Escribir ""
		
	Fin Para
	
FinAlgoritmo