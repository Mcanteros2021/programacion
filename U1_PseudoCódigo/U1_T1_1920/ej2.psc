Algoritmo sin_titulo
	DEFINIR num, nuevo COMO TEXTO;
	DEFINIR posicion,contador COMO ENTERO;
	
	Escribir "Introduce el número";
	Leer num;
	Escribir "Introduce la posición";
	Leer posicion;
	Escribir "Introduce el nuevo número";
	Leer nuevo;
	
	Para contador<-1 Hasta longitud(num) Hacer
		Si contador=posicion Entonces
			Escribir sin saltar nuevo;
		SiNo
			Escribir sin saltar Subcadena(num,contador,contador)
		Fin Si
	Fin Para
	Escribir " ";
FinAlgoritmo
