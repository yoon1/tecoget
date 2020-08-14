package com.yoon.tecoget;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class TecogetApplication {
	public static void main(String[] args) {
		SpringApplication.run(JavafxApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void init() { // 메소드 명은 임의로
		System.out.println("Hello ");
	}
}
