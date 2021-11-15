package com.nataajahtask.providerservice.resource;

import com.nataajahtask.providerservice.models.ProviderIncoming;
import com.nataajahtask.providerservice.models.ProviderResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProviderResource {

    @Autowired      
    private Providerservice proService;

    @RequestMapping("/{providerName}.com/v{providerNumber}/api/account/validate")
    public @ResponseBody
    ProviderResult getAccountValidation(@PathVariable int providerNumber,
                                        @RequestBody ProviderIncoming providerIncoming)
    {

        ProviderResult providerResult = new ProviderResult();

        if(providerNumber > 1) {
            providerResult.setIsValid(proService.validateAccount2(providerIncoming));
        }

        else
            providerResult.setIsValid(proService.validateAccount(providerIncoming));

        return providerResult;

    }

}

