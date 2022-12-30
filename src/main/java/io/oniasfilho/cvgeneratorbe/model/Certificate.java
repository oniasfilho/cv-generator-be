package io.oniasfilho.cvgeneratorbe.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Certificate {
    private String timeFrame;
    private String name;
    private String info;
}
