package com.newyou.bydebby.basic.springbasicapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBasicAppApplication {

	static Logger LOGGER = LoggerFactory.getLogger(SpringBasicAppApplication.class);

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortImpl());
		int indexFound = binarySearch.binarySearch(8, new int[]{6, 3, 4, 1, 8});
		LOGGER.info("Number found at index:{}",indexFound);
		//SpringApplication.run(SpringBasicAppApplication.class, args);
	}
}
