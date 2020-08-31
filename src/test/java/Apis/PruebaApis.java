package Apis;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Assert;
import org.junit.Test;

public class PruebaApis {


    @Test
    public void apiTest() throws UnirestException {

        HttpResponse<JsonNode> jsonResponse= Unirest.get("http://www.omdbapi.com/?apikey=99ef2dab&s=thor")
        .header("accept","application/json")
        .asJson();

        //System.out.println("Status------------"+jsonResponse.getStatus());
        //System.out.println("Json Body------------"+jsonResponse.getBody());
        //System.out.println("Status Text------------"+jsonResponse.getStatusText());
         Gson gson = new Gson();
         Gson gsonSearch = new Gson();

         PeliculasObject peliculasObject = gson.fromJson(String.valueOf(jsonResponse.getBody()),PeliculasObject.class);
        PeliculasSearch peliculasSearch = gsonSearch.fromJson(String.valueOf(peliculasObject.Search.get(9)),PeliculasSearch.class);
         //System.out.println(peliculasObject.Search.get(0).toString());
        System.out.println(peliculasObject.Search.get(9));


       // Assert.assertNotNull(jsonResponse);
        Assert.assertEquals("63",peliculasObject.getTotalResults());
    }





}
