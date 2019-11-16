package com.rest.api.getcontest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetContest 
{
    @Test
	public void getContest()
	{
    	
    	RestAssured.baseURI="http://10.10.14.113:8090/ls/api/leagueservice/";
        RestAssured.basePath= "/contest";
        
        Response req= given().contentType(ContentType.JSON).log().all().get("/6855");
        req.prettyPrint();
        
	}
}
