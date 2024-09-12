package org.example.springstudy.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BikeStation {

    @JsonProperty("rackTotCnt")
    private String rackTotCnt;

    @JsonProperty("stationName")
    private String stationName;

    @JsonProperty("parkingBikeTotCnt")
    private String parkingBikeTotCnt;

    @JsonProperty("shared")
    private String shared;

    @JsonProperty("stationLatitude")
    private String stationLatitude;

    @JsonProperty("stationLongitude")
    private String stationLongitude;

    @JsonProperty("stationId")
    private String stationId;
}
