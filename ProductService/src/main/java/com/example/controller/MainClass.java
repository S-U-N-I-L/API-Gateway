package com.example.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

public class MainClass {

    public static void main(String[] args) {
        String gatewayUrl = "http://localhost:8080";
        String accessToken = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJDWEJfN3hBYURSOUVOWWVuNmVfR19WekxldkJDdXJTLTRWXzZscVdMa3Z3In0.eyJleHAiOjE3MDc3NzM3OTUsImlhdCI6MTcwNzc3MzQ5NSwianRpIjoiYWMzYmViNWQtMmY2OC00OTI3LThhNjctOTFmNGEzZDRiYWZiIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDkwL3JlYWxtcy9kZW1vLXJlYWxtIiwiYXVkIjoiYWNjb3VudCIsInN1YiI6IjNmYzE1MmEzLWMyYWEtNGUxYS04MzJhLWE2ZDlkNGZkODE1MSIsInR5cCI6IkJlYXJlciIsImF6cCI6ImFwaS1nYXRld2F5Iiwic2Vzc2lvbl9zdGF0ZSI6IjFhMDJlOWNjLWNmYzktNGNiMy05MWI3LTBjNDY2OGVmYmM1MSIsImFjciI6IjEiLCJhbGxvd2VkLW9yaWdpbnMiOlsiaHR0cDovL2xvY2FsaG9zdDo4MDgwIl0sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJvZmZsaW5lX2FjY2VzcyIsImRlZmF1bHQtcm9sZXMtZGVtby1yZWFsbSIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJvcGVuaWQgZW1haWwgcHJvZmlsZSIsInNpZCI6IjFhMDJlOWNjLWNmYzktNGNiMy05MWI3LTBjNDY2OGVmYmM1MSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwibmFtZSI6IlN1bmlsIFNoYXJtYSIsInByZWZlcnJlZF91c2VybmFtZSI6InN1bmlsIiwiZ2l2ZW5fbmFtZSI6IlN1bmlsIiwiZmFtaWx5X25hbWUiOiJTaGFybWEiLCJlbWFpbCI6InN1bmlsc3RpY2t5QGdtYWlsLmNvbSJ9.DU4YXsl7jRHqwqfu_rU9Ny1EAqrSDnbECSpvkHEvlHTla8iqWMjzm53vRAtL7K8Yvx1Ch_2Cszy9SQvnKBhMkDf-KBgsbg9Q3yM-GTvdT_HhW9wmOvqZCeyPuWKsNXQ1uyMvrjNL1zENYox51-cV3A7PTnH6x8kCdDAPKQ7trx5Ry1QeIxmv4kxawS2Ywyk2EwU8tWnwAo9v52KGP4WUFgeoSeZywNdOr0pysZpmOV8QH3CZjg7bZEVrlSc_dGj3f45ESjEn3DygYfyedlOuzghU1-bVrZyHagHqKUEHd3Yw6_mHnkqewqw6UgxJZyDsF3luZi1sgH308LHvMQpaaA";

        WebClient client = WebClient.builder()
                .baseUrl(gatewayUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken)
                .build();

        System.out.println("calling ");
        client.get()
                .uri("/products/")
                .exchange()
                .doOnError(err -> System.out.println(err))
                .doOnSuccess(res -> System.out.println("res"+ res.statusCode()));

    }
}
