Funcion c <- espaciado ( cad )
	Definir pos Como Entero
	c=""
	Para pos<-1 Hasta Longitud(cad) hacer
		c = c + Subcadena(cad,pos,pos)+"-"
	Fin Para
Fin Funcion

Algoritmo espacios
	Definir cad Como Caracter
	
	Escribir "Introduce el texto"
	leer cad
	
	Escribir espaciado(cad)
	
FinAlgoritmo
