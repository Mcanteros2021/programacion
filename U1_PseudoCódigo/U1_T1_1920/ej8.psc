Algoritmo ejercicio8
	//Desarrolla un programa que pida un n�mero, y luego escriba un men� con 3 opciones: 
	//1-calcular el valor absoluto 
	//2-calcular la ra�z cuadrada 
	//3- calcular el cuadrado de ese n�mero. 
	//Seg�n la opci�n que ingrese el usuario, debe calcularse una cosa u otra.
	Definir num Como Real
	Definir op Como Entero
	
	Escribir "Introduce el n�mero"
	Leer num
	
	Escribir "Elige opci�n"
	Escribir "1.- Valor absoluto"
	Escribir "2.- Ra�z Cuadrada"
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
			Escribir "Opci�n no v�lida"
	Fin Segun
FinAlgoritmo
