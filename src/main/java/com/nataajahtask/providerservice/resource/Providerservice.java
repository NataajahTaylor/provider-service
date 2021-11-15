package com.nataajahtask.providerservice.resource;

import com.nataajahtask.providerservice.models.ProviderIncoming;
import org.springframework.stereotype.Service;

@Service
public class Providerservice {

    public boolean validateAccount(ProviderIncoming incoming)
    {
        if (incoming.getAccountNum() < 1000)
        {
            return false;
        }

        else return true;
    }

    public boolean validateAccount2(ProviderIncoming incoming)
    {
        if (incoming.getAccountNum() > 200)
        {
            return true;
        }

        else return false;
    }

}
