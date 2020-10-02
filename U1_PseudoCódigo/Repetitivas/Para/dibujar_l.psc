Algoritmo dibujar_L
	
	// Realiza un programa que pinte la letra L por pantalla hecha con 
	// asteriscos. El programa pedirá la altura. El palo horizontal de 
	// la L tendrá una longitud de la	//mitad (división entera entre 2) 
	// de la altura más uno.
	
	//Ejemplo:
	
	//Introduzca la altura de la L: 5
	//   *
	//   *
	//   *
	//   *
	//   * * *
	
	Definir f,x  Como Entero
	
	Escribir "Introduce el tamaño"
	Leer f
	
	para x<-1 hasta f-1 hacer
		Escribir "*"
	FinPara
	
	para x<-1 hasta trunc(f/2)+1 hacer
		escribir sin saltar "*"
	FinPara
	
	Escribir ""
	
FinAlgoritmo
