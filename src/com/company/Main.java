package com.company;

public class Main {

    public static void main(String[] args) {
	int dujm = 0;
	double sm = 2.54;
	double result = 0;
	for (int i = 1;i <= 20;i++) {
	result = i * sm;
	dujm = dujm+1;
	System.out.println(dujm + " д. " + "равен " + result + " см.");
    }

    }
}
