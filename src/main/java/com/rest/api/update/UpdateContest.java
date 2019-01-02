package com.rest.api.update;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateContest 
{
	@Test
	public void updateContest()
	{
		RestAssured.baseURI="http://10.10.14.113:8090/ls/api/leagueservice";
        RestAssured.basePath= "/contest";
        
        File json= new File("jsonfiles\\putsample.json");
		Response req=given().contentType(ContentType.JSON).log().all().body(json).put("/5312");
		req.prettyPrint();
	}
}
