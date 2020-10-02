Algoritmo ej3_control_accesp
	//Realiza el control de acceso a una caja fuerte. 
	//La combinación será un
	//número de 4 cifras. El programa nos pedirá la 
	// combinación para abrirla. Si no
	//acertamos, se nos mostrará el mensaje “Lo siento, 
	//esa no es la combinación”
	//y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
	//Tendremos cuatro oportunidades para abrir la caja fuerte.
	Definir codigo, clave, num_intentos Como Entero	

	num_intentos=0
	
	Repetir
		Escribir "Introduzca la contraseña"
		Leer clave
		SI clave!=codigo Entonces
			Escribir "Esa no es"
			num_intentos = num_intentos+1
		FinSi
	Hasta Que clave = codigo O num_intentos=4
	
	SI clave!=codigo Entonces
		Escribir "Has perdido. Has consumido los 4 intentos"
	SiNo
		Escribir "Has ganado"
	FinSi

FinAlgoritmo
	