package com.rest.api.delete;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteContest 
{
	
	@Test
	public void deleteContest()
	{
		RestAssured.baseURI="http://10.10.14.113:8090/ls/api/leagueservice";
        RestAssured.basePath= "/contest";
        
        Response req= given().contentType(ContentType.JSON).log().all().delete("/6855");
        req.prettyPrint();
	}

}
