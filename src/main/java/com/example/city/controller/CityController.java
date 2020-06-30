package com.example.city.controller;

import com.example.city.controller.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/rest/city")
public class CityController {

    /*@Autowired
    RestTemplateBuilder builder;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }*/


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/c/{cityName}", method = RequestMethod.GET)
    public String getCity( @PathVariable(value = "cityName") String cityName){
        String url ="http://api.openweathermap.org/data/2.5/weather?q="+cityName+"&appid=ba2e26157dd2d87c9ac4ff1a959d8e8c";
        System.out.println(url);
        String str =getRestTemplate()
                .getForObject(url, String.class);
        return str;
    }


}

