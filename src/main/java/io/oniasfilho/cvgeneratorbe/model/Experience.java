package io.oniasfilho.cvgeneratorbe.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Experience {
    private String timeFrame;
    private String companyName;
    private String jobTitle;
    private String jobDescription;
}
