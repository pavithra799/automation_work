package com.rest.api.justkhel;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateContest 
{
	@Test
	public static void createContest()
	{
		RestAssured.baseURI="http://10.10.12.205:8081/";
		RestAssured.basePath= "createContest";
		
		File json= new File("jsonfiles\\jkContest.json");
		Response respone=given().contentType(ContentType.JSON).log().all().body(json).post();
		
		respone.prettyPrint();
	}
}
