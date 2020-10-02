Algoritmo fibonacci
	Definir tmp,x,n1,n2,tam Como Entero
	
	n1 = 0
	n2 = 1
	
	Repetir
		Escribir "Dime el tamaño de la serie.Min3"
		Leer tam
	Hasta que tam>=3
	
	Escribir Sin Saltar n1," ",n2
	
	para x<-3 HASTA tam Hacer
		Escribir sin saltar " ",n1+n2
		tmp = n1+n2		
		n1 = n2
		n2 = tmp
	FinPara
	
FinAlgoritmo
