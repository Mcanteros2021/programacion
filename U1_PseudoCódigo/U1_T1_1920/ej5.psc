Funcion esta <- contiene ( v,num )
	definir esta como logico;
	Definir i como entero;
	
	esta<-falso;
	Para i<-1 Hasta 5 Hacer
		si v[i]=num Entonces
			esta=verdadero;
		FinSi
	Fin Para
	
Fin Funcion
	
Funcion cantidad <- ocurrencias ( v,num )
	definir cantidad como entero;
	Definir i como entero;
	
	cantidad<-0;
	
	Para i<-1 Hasta 5 Hacer
		si v[i] = num Entonces
			cantidad<-cantidad+1;
		FinSi
	Fin Para
	
Fin Funcion

Algoritmo sin_titulo
	definir datos como entero;
	Dimension datos[5];
	
	datos[1]=44;
	datos[2]=66;
	datos[3]=7;
	datos[4]=100;
	datos[5]=100;
	
	Escribir contiene(datos,5);
	Escribir contiene(datos,7);
	Escribir ocurrencias(datos,100);
	Escribir ocurrencias(datos,150);
FinAlgoritmo
