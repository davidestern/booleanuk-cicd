package org.davidstern.booleanukcicd.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HealthControllerTest {

    private HealthController healthController;

    public HealthControllerTest() {
        healthController = new HealthController();
    }

    @Test
    public void testGetStatus() {
        String status = healthController.getStatus();
        assertEquals("OK", status);
    }

}
