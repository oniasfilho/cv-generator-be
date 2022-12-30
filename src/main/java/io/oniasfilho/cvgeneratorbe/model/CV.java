package io.oniasfilho.cvgeneratorbe.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CV {
    private PersonalInfo personalInfo;
    private List<Experience> experiences;
    private List<Certificate> certificates;
}
