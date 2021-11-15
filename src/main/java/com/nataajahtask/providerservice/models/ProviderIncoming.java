package com.nataajahtask.providerservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProviderIncoming {

    @JsonProperty("accountNumber")
    private Long accountNumber;

    public ProviderIncoming() {}

    public ProviderIncoming(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getAccountNum() {
        return accountNumber;
    }

    public void setAccountNum(Long accountNum) {
        this.accountNumber = accountNum;
    }

}
