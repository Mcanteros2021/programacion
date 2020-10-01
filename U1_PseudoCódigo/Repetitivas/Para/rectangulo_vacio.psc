Algoritmo rectangulo_vacio
	Definir altura, anchura, f,c Como Entero
	
	Escribir "Introduce la altura"
	Leer altura
	Escribir  "Introduce la anchura"
	Leer anchura
	
	Para f<-1 Hasta altura Hacer
		Para c<-1 Hasta anchura Hacer
			SI f=1 O f=altura O c=1 O c=anchura Entonces
				Escribir sin saltar "*"
			SiNo
				Escribir sin saltar "-"
			FinSi
		FinPara
		
		Escribir ""
		
	Fin Para
	
FinAlgoritmo
