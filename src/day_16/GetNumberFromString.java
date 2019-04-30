package day_16;

public class GetNumberFromString {
public static void main(String[] args) {
	String sentence = "i wrote [1236] lines of code today";
	
	int start = sentence.indexOf('[')+1;
	int end = sentence.indexOf(']');
	String codeCount = sentence.substring(start, end);
	System.out.println("Lines of code:"+ codeCount);
}
}
