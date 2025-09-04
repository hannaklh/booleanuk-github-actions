package org.booleanuk.github_actions;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StatusController {
    public String status() {
        return "Service is Active";
    }
}
