package io.oniasfilho.cvgeneratorbe.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SocialInfo {
    private String website;
    private String handle;
    private String url;
}
