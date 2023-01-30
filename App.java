package com.example;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     * @throws InterruptedException
     * @throws IOException
     */
    public static void main( String[] args ) throws IOException, InterruptedException
    {
         String url="https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=26bec0bd160e4207b566e58f26ff1501&include=minutely";
       HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
       HttpClient httpClient=HttpClient.newBuilder().build();
       HttpResponse<String> httpresponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
       System.out.println(httpresponse.statusCode());
       System.out.println(httpresponse.body());
    }
}

