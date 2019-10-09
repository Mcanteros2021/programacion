Algoritmo sin_titulo
	DEFINIR ht como ENTERO;
	
	Escribir "Introduce las horas trabajadas";
	Leer ht;
	
	Si ht<=40 Entonces
		Escribir "El sueldo es ",(ht*10)
	SiNo
		Escribir "El suelo es ",(400+((ht-40)*15));
	Fin Si
	
FinAlgoritmo
