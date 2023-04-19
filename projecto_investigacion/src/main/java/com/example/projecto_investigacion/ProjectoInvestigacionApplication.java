package com.example.projecto_investigacion;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import view.AuthorView;


@SpringBootApplication
public class ProjectoInvestigacionApplication {

	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException{
		
		//INTRODUCIMOS ID DEL AUTHOR DESDE EL MAIN
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca id del autor: ");
		String id_author = reader.nextLine();
		
		//CREAMOS OBJETO DE LA VISTA
		AuthorView auv = new AuthorView();
		
		//LLAMAMOS AL METODO PARA OBTENER DATOS SOBRE EL AUTOR 
		auv.TableAuthor(id_author);
		
       
	}

}
