package com.app.runner;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CMD    implements   CommandLineRunner {
	public void run(String... args) throws Exception {
		System.out.println(Arrays.asList(args));

	} 
}
