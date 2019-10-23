package net.fxclass.springboot.controller;

import net.fxclass.springboot.entities.Provider;
import net.fxclass.springboot.mapper.ProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProviderController {
    @Resource
    ProviderMapper providerMapper;

    @GetMapping("/provider/{pid}")
    public Provider getProvider(@PathVariable("pid") Integer pid){
        return providerMapper.getProviderByPid(pid);
    }

    @GetMapping("/provider")
    public Provider addProvider(Provider provider){
        providerMapper.addProvider(provider);
        return provider;
    }

    @GetMapping("/update")
    public Provider updateProvider(Provider provider){
        providerMapper.updateProvider(provider);
        return provider;
    }
}
