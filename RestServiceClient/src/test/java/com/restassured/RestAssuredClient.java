package com.restassured;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import com.example.Example;
import com.example.XmltoPojo;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredClient {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

			RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city/";
			Response thenReturn = given().when().get("hyderabad").thenReturn();
			//String temp= given().when().get("hyderabad").then().statusCode(200).extract().path("Temperature");
			
			String respoString= thenReturn.asString();
			System.out.println("resonse json is :"+respoString);
			
			ObjectMapper o= new ObjectMapper();
			//Example readValue = o.readValue(new File("C:\\imp_document\\data.json"), Example.class);
			//System.out.println("desciropn :"+readValue.getItems().get(0).getFields().get(0).getName());
			
			
			XmltoPojo readValue2 = o.readValue(new File("C:\\imp_document\\data.json"), XmltoPojo.class);
		    System.out.println("----------asdasdasd--asdasdasdasdasdas----------xl read :"+readValue2.getNote().getTo());
			
			
			
			
			
			
	}


}
