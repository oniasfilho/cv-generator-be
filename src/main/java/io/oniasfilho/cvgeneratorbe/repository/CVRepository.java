package io.oniasfilho.cvgeneratorbe.repository;

import io.oniasfilho.cvgeneratorbe.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CVRepository {

   public CV buildSampleCV(){
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Object Oriented Programming");
        hardSkills.add("Spring Framework");

        List<String> softSkills = new ArrayList<>();
        softSkills.add("Communicative");
        softSkills.add("Collaborative");

        List<SocialInfo> socialInfo = new ArrayList<>();

        SocialInfo socialInfoLinkedin = SocialInfo.builder()
                .website("linkedin")
                .handle("/oniasfilho")
                .url("http://www.linkedin.com/in/oniasfilho")
                .build();

        SocialInfo socialInfoGithub = SocialInfo.builder()
                .website("github")
                .handle("/oniasfilho")
                .url("http://www.github.com/oniasfilho")
                .build();

        socialInfo.add(socialInfoGithub);
        socialInfo.add(socialInfoLinkedin);

        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("65 98152-2040");

        ContactInfo contactInfo = ContactInfo.builder()
                .phoneNumbers(phoneNumbers)
                .email("onias.filho@gmail.com")
                .build();

        PersonalInfo personalInfo = PersonalInfo.builder()
                .firstName("Onias")
                .lastName("da Rocha")
                .currentJob("Software Engineer")
                .hardSkills(hardSkills)
                .softSkills(softSkills)
                .socialLinks(socialInfo)
                .contactInfo(contactInfo)
                .build();

       Experience exp1 = Experience.builder()
               .timeFrame("2021")
               .companyName("Mercado Livre")
               .jobTitle("Programador")
               .jobTitle("Faço altas coisa")
               .build();

       List<Experience> experiences = new ArrayList<>(List.of(exp1));

       Certificate c1 = Certificate.builder()
               .timeFrame("2012")
               .name("Web Design")
               .info("Microlins")
               .build();

       List<Certificate> certificates = new ArrayList<>(List.of(c1));

       return CV.builder()
               .personalInfo(personalInfo)
               .experiences(experiences)
               .certificates(certificates)
               .build();
    }

    public CV getCV(){
       return buildSampleCV();
    }

}
