package com.selvaraj.brazil.springselenium.conditional;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CarTest extends SpringBaseTestNGTest {

    @Qualifier("civic")
    @Autowired
    private Car car;

    @Test
    public void carTest() {
        this.car.run();
    }

}
