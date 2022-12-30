package io.oniasfilho.cvgeneratorbe.controller;

import io.oniasfilho.cvgeneratorbe.model.CV;
import io.oniasfilho.cvgeneratorbe.service.CVService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CVController {
    CVService service;

    public CVController(CVService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "https://cv-generator.herokuapp.com/")
    @GetMapping("/cv")
    public CV getCV(){
        return service.getCV();
    }
}
