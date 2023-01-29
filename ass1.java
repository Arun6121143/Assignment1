package com.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Hello world!
 *
 */
public class ass1 
{
    /**
     * @param args
     */
    public static void main( String[] args ) throws Exception
    {
       String url="https://api.chucknorris.io/jokes/random";
       HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
       HttpClient httpClient=HttpClient.newBuilder().build();
       HttpResponse<String> httpresponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
       System.out.println(httpresponse.statusCode());
       System.out.println(httpresponse.body());

    }
}
