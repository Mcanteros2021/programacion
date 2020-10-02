Algoritmo dibujar_u
	//Realiza un programa que pinte la letra L por pantalla hecha con 
	//asteriscos. El programa pedirá la altura. El palo horizontal de la L 
	// tendrá una longitud de la mitad (división entera entre 2) de la 
	//altura más uno.
    //Ejemplo:
	
	//Introduzca la altura de la L: 5
	//  *   *
	//  *   *
	//  *   *
	//  *   *
	//   ***
	
	Definir tam,f Como Entero
	
	Escribir "Introduce el tamaño de la U"
	Leer tam
	
	Para f<-1 Hasta tam Hacer
		Escribir "*   *"   
	Fin Para
	
	Escribir " *** "
	
	//Solución de Gonzalo
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
