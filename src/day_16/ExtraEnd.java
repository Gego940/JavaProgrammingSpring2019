package day_16;

public class ExtraEnd {
public static void main(String[] args) {
	String str = "hihi";
	String result = "";
	if(str.length()==2) {
		result = str+str+str;
		
	}else {
		result = str.substring(str.length()-2);
		result+= result+ result;
		System.out.println(result);
	}
}
}
