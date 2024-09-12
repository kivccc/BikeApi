package org.example.springstudy.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
@Slf4j
class OpenApiUtilTest {

    @Autowired
    private OpenApiUtil openApiUtil;


    @Test
    @DisplayName("공공 Api 연결 테스트")
    void getData() {
        String serviceName="bikeList";
        String startIndex="1";
        String endIndex="5";

        ResponseEntity<?> response=openApiUtil.getData(serviceName,startIndex,endIndex);
        System.out.println(response);

    }
}