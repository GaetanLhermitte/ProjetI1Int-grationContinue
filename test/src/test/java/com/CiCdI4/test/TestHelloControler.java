package com.CiCdl4.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloControllerTest{

    @Test
    public void testIndex() {
        HelloController helloController = new HelloController();

        String resultIndex = helloController.index();

        assertThat(resultIndex).isEqualTo("Hello !!");

    }

}