Funcion v <- esmultiplo ( num1,num2 )
	SI (num1%num2)=0 Entonces
		v=Verdadero
	SiNo
		v=Falso		
	FinSi
Fin Funcion


Algoritmo func_es_multiplo
	Definir n1,n2 Como Entero
	
	Escribir "Introduce los dos n�meros"
	Leer n1,n2
	
	SI esmultiplo(n1,n2) Entonces
		Escribir n1," es m�ltiplo de ",n2
	Sino 
		Escribir n1," no es m�ltiplo de ",n2
	FinSi
FinAlgoritmo
