package view;

import java.io.IOException;
import java.net.URISyntaxException;



import javax.swing.*;

import controller.AuthorController;

public class AuthorView{
	   
		JFrame f;    
	    public void TableAuthor(String id_author) throws IOException, InterruptedException, URISyntaxException{    
	    	
			//CREAMOS OBJETO DEL CONTROLADOR
	    	AuthorController authorController = new AuthorController();
	    	
	    	//OBTENEMOS LOS PARAMETROS DEL AUTOR INGRESADO POR EL ID
	    	String[] parametros = authorController.obtenerAuthor(id_author);
	    	
	    	//GUARDAMOS
	    	String authorId = parametros[0];
	    	String authorName =  parametros[1];
	    	String authorAffiliation = parametros[2];
	    	String authorEmail =  parametros[3];
	        
		    f=new JFrame();    
		    
		    //FILAS
		    String data[][]={ {authorId,authorName,authorAffiliation,authorEmail}};    
		           
		    //COLUMNAS
		    String column[]={"ID","NAME","AFFILLIATION","EMAIL"};    
		    
		    //CREAMOS TABLA
		    JTable jt=new JTable(data,column);
		    
		    //TAMAÑO DE RECTANGULO
		    jt.setBounds(30,40,200,300);     
		    //SCROLL
		    JScrollPane sp=new JScrollPane(jt);    
		    f.add(sp);          
		    //TAMAÑO DE VENTANA
		    f.setSize(500,300);  
		    //VER TABLA
		    f.setVisible(true);    
	    }     

}  

