package com.selvaraj.brazil.springselenium.conditional;

import com.selvaraj.brazil.springselenium.SpringBaseTestNGTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CarTest extends SpringBaseTestNGTest {

    @Autowired
    private Car car;

    @Test
    public void carTest() {
        this.car.run();
    }

}
