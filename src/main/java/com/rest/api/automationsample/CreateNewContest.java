package com.rest.api.automationsample;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateNewContest 
{
	@Test
	public static void createContest()
	{
		RestAssured.baseURI="http://10.10.14.113:8090/ls/api/leagueservice/contest/";
		RestAssured.basePath= "/simpleContest";
		
		File json= new File("jsonfiles\\sample.json");
		Response respone=given().contentType(ContentType.JSON).log().all().body(json).post();
		
		respone.prettyPrint();
	}
	
}
