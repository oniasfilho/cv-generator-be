package io.oniasfilho.cvgeneratorbe.service;

import io.oniasfilho.cvgeneratorbe.model.CV;
import io.oniasfilho.cvgeneratorbe.repository.CVRepository;
import org.springframework.stereotype.Service;

@Service
public class CVService {
    CVRepository repository;

    public CVService(CVRepository repository) {
        this.repository = repository;
    }

    public CV getCV() {
        return repository.getCV();
    }
}
