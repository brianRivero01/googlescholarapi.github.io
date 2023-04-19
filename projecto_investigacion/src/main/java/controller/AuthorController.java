package controller;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AuthorController {
	
	 public static String[] obtenerAuthor(String id) throws IOException, InterruptedException, URISyntaxException {
		 	String[] parametros = new String[4];
		 	//SE CREA HttpCLient
			HttpClient client = HttpClient.newHttpClient();
			
			//PARAMETROS
			String url = "https://serpapi.com/search?engine=google_scholar_author";
			String apiKey = "cf5e3f023ca0afe26c366be2462dc8f41867d7ab1664768f66445c1772889013";
			Integer num = 0;
			
			//URL DE API
			//https://serpapi.com/search?engine=google_scholar_author&api_key=xxxxxxxxxx&author_id=xxxxxxxxxxx&num=xxx
		    String requestUrl = url + "&api_key=" + apiKey + "&author_id=" + id + "&num=" + num;
		    
		    //SOLICITUD GET
		    HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create(requestUrl))
	                .build();
		    
		    HttpResponse<String> response = client.send(request,
	                HttpResponse.BodyHandlers.ofString());

	        //System.out.println(response.body());
	        
	        
		    //CREO OBJETO JSON PARA LUEGO OBTENER DATOS EN ESPECIFICO DE LA API
	        JSONObject obj = new JSONObject(response.body());
	        
	        //OBTENGO DATOS DE LA API A TRAVÉS DE SU CLAVE-VALOR
	        String authorId = obj.getJSONObject("search_metadata").getString("id");
	        String authorName = obj.getJSONObject("author").getString("name");
	        String authorAffiliation = obj.getJSONObject("author").getString("affiliations");
	        String authorEmail = obj.getJSONObject("author").getString("email");
	        
	        //CARGO DATOS AL ARRAY
	        parametros[0] = authorId;
	        parametros[1] = authorName;
	        parametros[2] = authorAffiliation;
	        parametros[3] = authorEmail;
	        
	        return parametros;
	        
	        //MUESTRO
	        /*
	        System.out.println(authorId);
	        System.out.println(authorName);
	        System.out.println(authorAffiliation);
	        System.out.println(authorEmail);*/
	       
	 }
	
}
