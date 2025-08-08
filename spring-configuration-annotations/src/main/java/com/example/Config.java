package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.service.Register;
import com.example.service.SalesTaxCalculator;
import com.example.service.TaxCalculator;
import org.springframework.stereotype.Component;


@Configuration   
@PropertySource("classpath:app.properties")
@ComponentScan(basePackages = "com.example.service")
public class Config {

    //  TODO-02: Comment out the @Bean definitions in this class (below).
    //  Re-run the previous test.  It should fail.  Do you understand why?


    //  TODO-03:  Add a @ComponentScan annotation to this class.
    //  Set the basePackages attribute to reference the service package.
    //  Organize your imports, save your work.

}
