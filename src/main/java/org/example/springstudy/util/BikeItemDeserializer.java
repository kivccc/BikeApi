package org.example.springstudy.util;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.springstudy.dto.BikeStation;
import org.example.springstudy.dto.BikeStationList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BikeItemDeserializer extends JsonDeserializer<BikeStationList> {

    private final ObjectMapper objectMapper;

    public BikeItemDeserializer() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public BikeStationList deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        JsonNode node=jsonParser.getCodec().readTree(jsonParser);
        JsonNode itemNode=node.findValue("row");

        List<BikeStation> bikeStations= Arrays.stream(objectMapper.treeToValue(itemNode, BikeStation[].class)).toList();

        return new BikeStationList(bikeStations);
    }
}
