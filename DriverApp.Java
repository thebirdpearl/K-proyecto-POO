import java.util.Scanner;
public class DriverApp{
	public static void main(String args[]){
		// se usa la utielidad de scaner para recibir la respuesta del ususario
		//Se instancian los atributos de la clase
		int opcion = 0;
		Scanner scan = new Scanner(System.in);
		boolean bandc=true;//detiene el while principal si el usuario metió un numero invalido (band==true--> todo en orden)(band==false--> hubo un error)
		practicar practica = new practicar();
		while (opcion != 4 && bandc==true){//loop que genera el menú para el usuario
		    //se despliega el menú
			System.out.println("\n\nBienvenido a K' la app para aprender idioma maya");
			System.out.println("Escoge una opcion marcando el numero que le antecede");
			System.out.println("1. Traductor");
			System.out.println("2. Lecciones");
			System.out.println("3. Nosotros");
			System.out.println("4. Cerrar la App\n\n");

			try{
				opcion = scan.nextInt(); //se copia la respuesta del ususario en una variable

			}catch(Exception e){
				//System.out.println("Por favor ingrese un numero validop");
				bandc=false;
				opcion=4;
			}


			if (opcion == 1 ){//aqui va la página de traducción
			    boolean bandt=true; //ayuda a validar al igual que bandc
				int opciont=0;//variable donde se guarda la opcion que se escoge en traductor
				while (opciont != 3 && bandt==true){
					System.out.println("Has ingresado a traductor");
					System.out.println("Escoge una opcion marcando el numero que le antecede");
					System.out.println("1. K'iche - Espanol");
					System.out.println("2. Espanol - K'iche");
					System.out.println("3. Cerrar Traductor\n\n");
					try{
						opciont = scan.nextInt(); //se copia la respuesta del ususario en una variable

					}catch(Exception e){
						//System.out.println("Por favor ingrese un numero validop");
						bandt=false;
						opciont=3;
					}
					if(opciont==1){//K'iche - Espanol

					}else if(opciont==2){//Espanol - K'iche

					}else if(opciont==3){//salir del traductor
						System.out.println("Gracias por utilizar el traductor");
					}else{
						System.out.println("Por favor ingrese un numero valido");
					}
				}
			} else if (opcion == 2){//agui va la pagina de lecciones
				boolean bandl=true; //ayuda a validar al igual que bandc
				int opcionl=0;//variable donde se guarda la opcion que se escoge en lecciones
				while (opcionl != 4 && bandl==true){
					//se despliega el menú de lecciones (solo puse 2 por el momento)
					System.out.println("Has ingresado a lecciones");
					System.out.println("Escoge una opcion marcando el numero que le antecede");
					System.out.println("1. Saludos");
					System.out.println("2. Familia");
					System.out.println("3. Vida cotidiana");
					System.out.println("4. Cerrar Lecciones\n\n");
					try{
						opcionl = scan.nextInt(); //se copia la respuesta del ususario en una variable

					}catch(Exception e){
						//System.out.println("Por favor ingrese un numero validop");
						bandl=false;
						opcionl=4;
					}
					if(opcionl==1){//Leccion de saludis
						System.out.println(practica.seleccion(1));					
					}else if(opcionl==2){//leccion de familia
						System.out.println("Opción 2");
						System.out.println(practica.seleccion(2));
					}else if(opcionl==3){//leccion de vida cotidiana
						System.out.println("Opción 3");
						System.out.println(practica.seleccion(3));
					}else if(opcionl==4){//salir de lecciones
						System.out.println("Has salido de las lecciones");
					}else{
						System.out.println("Por favor ingrese un numero valido");
					}
				}
			} else if (opcion == 3){//aqui va la info de nosotros
				System.out.println("\t\t\tNUESTRA HISTORIA");
				System.out.println("Somos un grupo de estudiantes de la Universidad del Valle de Guatemala con el objetivo de ayudar a nuestro pais en sus dificultades.");
				System.out.println("Durante nuestro curso de Programacion Orientada a Objetos tuvimos la oportunidad de ponernos manos a la obra y comenzar un proyecto.");
				System.out.println("Decidimos que tenía que ser algo orientado a la calidad educativa e igualdad entre los guatemaletecos. Es con ello que surgio la idea de K'.");
				System.out.println("Esta es una aplicacion que permite a las personas de nuestra bella nacion reconectar con sus raices a traves de los lenguajes nativos");
				System.out.println("Consideramos que si nosotros como ciudadanos buscamos herramientas para comunicarnos unos con otros, la brecha de la desigualdad se reduciria");
				System.out.println("\nGracias por apollarnos");
			} else if (opcion == 4){//opcion para sair
				System.out.println("Gracias por utilizar este programa.¡Hasta pronto!");//se cierra el programa
			}
			else{
				System.out.println("Por favor ingrese un numero valido, si usted ingresa una letra EL PROGRAMA SE CIERRA");//el programa se cierra si se ingresó una letra
			}
		}
	}
}
