package javaassignment;

public class ReverseString {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] words = test.split(" ");
		for (int i = 0; i < words.length; i++) {
		    if (i % 2 != 0) {
		        String[] evenWords = words[i].split("");
		        for (int j = evenWords.length - 1; j >= 0; j--) {
		            if (j % 2 == 0) {
		                System.out.print(evenWords[j]);
		            } else {
		                System.out.print(evenWords[j] + " ");
		            }
		        }
		        System.out.print(" ");
		    } else {
		        System.out.print(words[i] + " ");
		    }
		}

	}

}
