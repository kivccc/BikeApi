package org.example.springstudy.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.springstudy.dto.BikeStation;
import org.example.springstudy.dto.BikeStationList;
import org.example.springstudy.util.OpenApiUtil;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class OpenApiService {

    private final OpenApiUtil openApiUtil;

    public BikeStationList getBikeData(String startIndex,String endIndex)  {
        ResponseEntity<?> response=openApiUtil.getData("bikeList",startIndex,endIndex);


        String jsonData= String.valueOf(response.getBody());

        BikeStationList bikeStations=null;
        try{
            ObjectMapper objectMapper=new ObjectMapper();
            bikeStations=objectMapper.readValue(jsonData,BikeStationList.class);
        } catch (JsonProcessingException e){
            throw new RuntimeException("Json Data 파싱 중 에러", e);
        }
        return bikeStations;
    }

}
