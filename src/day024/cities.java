package day024;

public class cities {
public static void main(String[] args) {
	String[] cities = {"Washington D.C.","Kiev","Annandale","Moscow","Istanbul","Baku",
			"Miami","Silver spring","McLean"};
	
	for(int i=0;i< cities.length;i++) {
		if(cities[i].startsWith("M")) {
			System.out.println(cities[i]);
		}
	}
}
}
