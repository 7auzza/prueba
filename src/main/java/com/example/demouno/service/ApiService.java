package com.example.demouno.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Service;

import com.example.demouno.entities.EntityResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ApiService {

	String url = "https://api.publicapis.org/entries";
	// String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64)
	// AppleWebKit/537.36 (KHTML, like Gecko) Chrome/113.0.0.0 Safari/537.36";
	String userAg = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/113.0.0.0 Safari/537.36";
	HttpClient httpClient = HttpClient.newHttpClient();
	HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).header("User-Agent", userAg).GET().build();

	public EntityResponse getDataFromApi() {

		try {

			HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

			ObjectMapper objectMapper = new ObjectMapper();
			EntityResponse res = objectMapper.readValue(response.body(), EntityResponse.class);
			return res;

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

	public void setHttpClient(HttpClient httpClient) {

		this.httpClient = httpClient;
	}

}
