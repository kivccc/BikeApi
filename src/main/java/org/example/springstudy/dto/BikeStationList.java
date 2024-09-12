package org.example.springstudy.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import org.example.springstudy.util.BikeItemDeserializer;

import java.util.List;

@Data
@JsonDeserialize(using = BikeItemDeserializer.class)
public class BikeStationList {
    @JsonProperty("row")
    private List<BikeStation> bikeStationList;

    public BikeStationList(List<BikeStation> bikeStations) {
        this.bikeStationList = bikeStations;
    }

}
