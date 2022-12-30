package io.oniasfilho.cvgeneratorbe.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class PersonalInfo {
    private String firstName;
    private String lastName;
    private String currentJob;
    private List<String> hardSkills;
    private List<String> softSkills;
    private List<SocialInfo> socialLinks;
    private ContactInfo contactInfo;
}
