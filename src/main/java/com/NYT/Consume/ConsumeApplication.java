package com.NYT.Consume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumeApplication {


	private static final Logger log = LoggerFactory.getLogger(ConsumeApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(ConsumeApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

		@Bean
		public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
			return args -> {
				NYTTopStories topStories = restTemplate.getForObject(
						"https://api.nytimes.com/svc/topstories/v2/arts.json?api-key=bGTHZMUxVkb9UsRdlQzaYCF9MjDGzXXI", NYTTopStories.class);
				log.info(topStories.toString());
			};
		}
	}

