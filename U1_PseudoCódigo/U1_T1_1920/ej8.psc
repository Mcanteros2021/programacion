Algoritmo ejercicio8
	//Desarrolla un programa que pida un número, y luego escriba un menú con 3 opciones: 
	//1-calcular el valor absoluto 
	//2-calcular la raíz cuadrada 
	//3- calcular el cuadrado de ese número. 
	//Según la opción que ingrese el usuario, debe calcularse una cosa u otra.
	Definir num Como Real
	Definir op Como Entero
	
	Escribir "Introduce el número"
	Leer num
	
	Escribir "Elige opción"
	Escribir "1.- Valor absoluto"
	Escribir "2.- Raíz Cuadrada"
	Escribir "3.- Cuadrado"
	Leer op
	
	Segun op Hacer
		1:
			Escribir "El valor absoluto es ",abs(num)
		2:
			Escribir "La raiz cuadrada es ", rc(num)
		3:
			Escribir "EL cuadrado es ", num*num
		De Otro Modo:
			Escribir "Opción no válida"
	Fin Segun
FinAlgoritmo
