Funcion v <- espar( n )
	Si n%2=0 Entonces
		v=Verdadero
	SINO 
		v=Falso
	FinSi
	
Fin Funcion

Algoritmo sin_titulo
	Definir num Como Entero
	Definir resultado Como Logico
	Escribir "Introduce el n�mero"
	Leer num	
	
	
	SI espar(num) Entonces
		Escribir "El n�mero es par"
	Sino 
		Escribir "El n�mero es impar"
	FinSi
	
FinAlgoritmo

