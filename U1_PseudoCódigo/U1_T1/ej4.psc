Algoritmo sin_titulo
	Definir datos,i,op como entero;
	
	Dimension datos[20];
	
	Para i<-1 Hasta 20 Hacer
		datos[i]<-azar(401);
	Fin Para
	
	Escribir "¿Qué números quiere resaltar?","1 - los múltiplos de 5"," 2 - los múltiplos de 7)"; 
	Leer op;
	
	Para i<-1 Hasta 20 Hacer
		Si (op=1 Y datos[i]%5=0) o (op=2 Y datos[i]%7=0) Entonces
			Escribir sin saltar "[",datos[i],"] "
		SiNo
			Escribir sin saltar datos[i]," ";
		Fin Si
	Fin Para
	
FinAlgoritmo
