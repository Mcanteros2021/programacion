Algoritmo sin_titulo
	DEFINIR num, nuevo COMO TEXTO;
	DEFINIR posicion,contador COMO ENTERO;
	
	Escribir "Introduce el n�mero";
	Leer num;
	Escribir "Introduce la posici�n";
	Leer posicion;
	Escribir "Introduce el nuevo n�mero";
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
