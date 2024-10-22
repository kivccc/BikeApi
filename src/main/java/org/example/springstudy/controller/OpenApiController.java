package org.example.springstudy.controller;

import lombok.RequiredArgsConstructor;
import org.example.springstudy.dto.BikeStationList;
import org.example.springstudy.service.OpenApiService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpenApiController {

    private final OpenApiService openApiService;

    @GetMapping("/api/getBikeData")
    public ResponseEntity<BikeStationList> getBikeData(){
        BikeStationList bikeStationList=openApiService.getBikeData("1","1000");
        return ResponseEntity.ok(bikeStationList);
    }
}
