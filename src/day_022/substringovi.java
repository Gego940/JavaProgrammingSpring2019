package day_022;

public class substringovi {
public static void main(String[] args) {
	String word = "java";
	System.out.println(word.substring(0,2));
	
	
	System.out.println(word.substring(0,1));
	
	
	System.out.println(word.substring(1,2));
	
	;
	System.out.println(word.substring(2,3));
	

	System.out.println(word.substring(3));
	
	System.out.println("#####################################");
	int i = 0;
	System.out.println(word.substring(i, i + 1));
	i++;
	System.out.println((word.substring(i,i+1)));
	i++;
	System.out.println((word.substring(i,i+1)));
	i++;
	System.out.println((word.substring(i,i+1)));
	
	
	System.out.println("########## FOR LOOP ################");
	
	for(int n = 0; n<=3; n++) {
	String letter = word.substring(n,n+1);
		
	System.out.println(letter);
}
		
//	System.out.println(word.substring(n, n+1));
		
		
		System.out.println("################");
		
		for( int n = 3; n>=0 ;n--) {
			String letter= word.substring(n,n+1);
			System.out.println(n);
		}
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
