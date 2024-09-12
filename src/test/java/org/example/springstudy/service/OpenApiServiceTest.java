package org.example.springstudy.service;

import lombok.extern.slf4j.Slf4j;
import org.example.springstudy.dto.BikeStation;
import org.example.springstudy.dto.BikeStationList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class OpenApiServiceTest {

    @Autowired
    private OpenApiService openApiService;


    @Test
    void getBikeData() {
        BikeStationList bikeStationsList=openApiService.getBikeData("1","5");
        log.info(bikeStationsList.toString());


    }
}