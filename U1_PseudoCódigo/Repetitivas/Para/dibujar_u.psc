Algoritmo dibujar_u
	//Realiza un programa que pinte la letra L por pantalla hecha con 
	//asteriscos. El programa pedir� la altura. El palo horizontal de la L 
	// tendr� una longitud de la mitad (divisi�n entera entre 2) de la 
	//altura m�s uno.
    //Ejemplo:
	
	//Introduzca la altura de la L: 5
	//  *   *
	//  *   *
	//  *   *
	//  *   *
	//   ***
	
	Definir tam,f Como Entero
	
	Escribir "Introduce el tama�o de la U"
	Leer tam
	
	Para f<-1 Hasta tam Hacer
		Escribir "*   *"   
	Fin Para
	
	Escribir " *** "
	
	//Soluci�n de Gonzalo
	//Para f<-1 Hasta tam Hacer
	//  Para c<-1 Hasta 5  Hacer
	//		SI f<>tam Entonces
	//			SI c=1 O c=5 Entonces
	//				Escribir sin saltar"*" 
	//			SINO 
	//				Escribir Sin Saltar " "
	//			FinSi	
	//		SiNo
	//			SI c=1 O C=5 Entonces
	//				Escribir Sin Saltar " "
	//			SiNo
	//				Escribir sin saltar "*"
	//			FinSi				
	//		FinSi
	//	Fin Para		
	//	Escribir ""
	//Fin Para	
	
FinAlgoritmo
