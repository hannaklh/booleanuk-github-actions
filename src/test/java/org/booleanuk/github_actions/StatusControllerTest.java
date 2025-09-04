package org.booleanuk.github_actions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(StatusController.class)
public class StatusControllerTest {
    private StatusController statusController;

    public StatusControllerTest() {
        statusController = new StatusController();
    }

    @Test
    void shouldReturnStatus(){
        assertEquals("Service is Active", statusController.status());
    }

}
