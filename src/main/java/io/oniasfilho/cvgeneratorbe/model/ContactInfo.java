package io.oniasfilho.cvgeneratorbe.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class ContactInfo {
    private List<String> phoneNumbers;
    private String email;
}
