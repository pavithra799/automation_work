package com.rest.api.goldRush;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateGRContest 
{
	@Test
	public static void createContest()
	{
		RestAssured.baseURI="http://10.90.5.19:4001/contest";
		RestAssured.basePath= "/create";
		
		File json= new File("jsonfiles/grcreate.json");
		Response respone=given().contentType(ContentType.JSON).log().all().body(json).post();
		
		respone.prettyPrint();
	}
	
}
