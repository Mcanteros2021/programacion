Algoritmo sin_titulo
	//2A. Desarrolla un programa que, partiendo de una cantidad de segundos diga con cuantas 
	//horas y minutos se corresponde. Debemos hacerlo para 624 minutos, 
	//claro que el programa debe funcionar aunque cambiemos ese valor. 
	//Pista: Para conseguir el número de horas, deberás truncar 624/60 para quedarte con su parte entera.
	
	//Ejemplo: 624 segundos son 10 horas y 24 minutos.
	Definir seg Como Entero
	Definir h,min Como Entero
	
	Escribir  "Introduzca el número de segundos"
	Leer seg
	
	h<-trunc(seg/3600)
	
	min = trunc((seg - (h*3600))/60)
	
	Escribir seg, "segundos son ",h, "horas y ",min," minutos"
	
FinAlgoritmo
