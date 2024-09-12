package org.example.springstudy.util;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class OpenApiUtil {
    private final String baseUrl="http://openapi.seoul.go.kr:8088/";

    @Value("${openApi.serviceKey}")
    private String serviceKey;

    private final String dataType="/json";

    private String makeUrl(String serviceName,String startIndex,String endIndex){
        return baseUrl+serviceKey+dataType+"/"+serviceName+"/"+startIndex+"/"+endIndex;
    }

    public ResponseEntity<?> getData(String serviceName,String startIndex,String endIndex){
        try {
            RestTemplate restTemplate=new RestTemplate();
            HttpEntity<?> entity=new HttpEntity<>(new HttpHeaders());

            return restTemplate.exchange(makeUrl(serviceName,startIndex,endIndex), HttpMethod.GET,entity,String.class);
        } catch (Error e){
           throw new IllegalArgumentException("Api 데이터 요청 중 에러 발생");
        }
    }


}
