package tp.pr1;

import java.io.IOException;
import java.util.Scanner;

import tp.pr1.control.Controlador;
import tp.pr1.logica.Partida;



public class Main {

	public static void main(String[] args) throws IOException {
		
		Partida partida=new Partida();
		Scanner in=new Scanner(System.in);
		Controlador controller=new Controlador(partida, in);
		controller.run();
	}

}
