package top.meethigher.springeventdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringEventDemoApplicationTests {

    @Autowired
    Registry registry;

    @Test
    void contextLoads() {
        registry.registryEvent();
        registry.registryEvent2();
    }
}
