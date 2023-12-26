package org.example.three;

import lombok.Builder;

@Builder
public class CompanyEnricher {
    public CompanyData enrich(String domain){
        return CompanyData.builder().build();
    }
}
