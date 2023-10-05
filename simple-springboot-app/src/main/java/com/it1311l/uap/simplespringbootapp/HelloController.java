package com.it1311l.uap.simplespringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello World";
	}
	
	@GetMapping("/sort")
	public int[] sort() {
		int[] arr = {3,10,8,9,2,2,8,10,2,3};
        bubbleSort(arr);
        return arr;
	}
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
	}
}
