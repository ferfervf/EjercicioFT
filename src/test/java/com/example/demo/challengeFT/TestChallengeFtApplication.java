package com.example.demo.challengeFT;

import org.springframework.boot.SpringApplication;

public class TestChallengeFtApplication {

	public static void main(String[] args) {
		SpringApplication.from(ChallengeFtApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
