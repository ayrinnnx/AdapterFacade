package org.example.three;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyData {
    private String domain;
    private String description;
    private String logo;
    private String address;

    public CompanyData(String domain, String description, String logo, String address){
        this.domain = domain;
        this.description = description;
        this.logo = logo;
        this.address = address;
    }
}
