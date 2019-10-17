Algoritmo sin_titulo
	Definir tam,contador,i COMO ENTERO;
	
	Escribir "Introduce el tamaño del reloj de arena";
	Leer tam;
	
	Mientras tam%2=0 o tam<3 Hacer
		Escribir "Tiene que ser mayor que 3 e impar";
		Escribir "Introduce el tamaño del reloj de arena";
		Leer tam;
	Fin Mientras
	
	Para contador<-tam Hasta 1 Con Paso -2 Hacer
		
		
		Para i<-1 Hasta (tam-contador)/2 con paso 1 Hacer
		Escribir sin saltar " ";
		Fin Para
		
		
		Para i<-contador Hasta 1 Hacer
			Escribir sin saltar "*";
		Fin Para
		
		Escribir " ";
	Fin Para
	
	Para contador<-3 Hasta tam Con Paso 2 Hacer
		
		
		Para i<-1 Hasta (tam-contador)/2 con paso 1 Hacer
			Escribir sin saltar " ";
		Fin Para
		
		
		Para i<-contador Hasta 1 Hacer
			Escribir sin saltar "*";
		Fin Para
		
		Escribir " ";
	Fin Para
	
FinAlgoritmo
