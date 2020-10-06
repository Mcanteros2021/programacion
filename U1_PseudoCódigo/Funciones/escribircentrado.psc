Funcion linea <- escribirCentrado ( cad)
	Definir tam,esp,contador Como Entero	
	esp = trunc((80-Longitud(cad))/2);
	linea=""
	
	para contador<-1 HASTA esp Hacer
		linea = concatenar(linea,"-")
	FinPara
	
	linea = linea + cad +linea	
	
Fin Funcion

Algoritmo centrado
	Definir text Como Caracter
	Escribir "Introduce la cadena"
	Leer text
	
	Escribir  escribirCentrado(text)	
FinAlgoritmo
