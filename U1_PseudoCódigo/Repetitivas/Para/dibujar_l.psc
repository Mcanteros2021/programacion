Algoritmo dibujar_L
	
	// Realiza un programa que pinte la letra L por pantalla hecha con 
	// asteriscos. El programa pedir� la altura. El palo horizontal de 
	// la L tendr� una longitud de la	//mitad (divisi�n entera entre 2) 
	// de la altura m�s uno.
	
	//Ejemplo:
	
	//Introduzca la altura de la L: 5
	//   *
	//   *
	//   *
	//   *
	//   * * *
	
	Definir f,x  Como Entero
	
	Escribir "Introduce el tama�o"
	Leer f
	
	para x<-1 hasta f-1 hacer
		Escribir "*"
	FinPara
	
	para x<-1 hasta trunc(f/2)+1 hacer
		escribir sin saltar "*"
	FinPara
	
	Escribir ""
	
FinAlgoritmo
