package com.pupwalkr;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
       LoggingRequestInterceptor loggingRequestInterceptor = new LoggingRequestInterceptor();
       return builder.basicAuthorization("8011194", "jb8hamWcLcmS")
               .additionalInterceptors(loggingRequestInterceptor)
               .requestFactory(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()))
               .build();
    }

}
