package com.company;

public class Main {

    public static void main(String[] args) {
	int sm = 0;
	double dujm = 2.54;
	double result = 0;
	for (int i = 1;i <= 20;i++) {
	result = i * dujm;
	sm = sm+1;
	System.out.println(sm + " см. " + "равен " + result + " д.");
    }

    }
}
