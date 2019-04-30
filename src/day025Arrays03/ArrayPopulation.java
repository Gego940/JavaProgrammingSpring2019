package day025Arrays03;

public class ArrayPopulation {
	public static void main(String[] args) {
	
int[] population = new int[5];
population[0]=346754;
population[1]=856443;
population[4]=245735;
population[2]=185464;
population[3]=925343;


//int [] population={10001, 10002, 10003, 10004,10005};

//System.out.println("City 1 population: "+population[4]);
int idx = 0 ;
System.out.println("City 1 population: "+population[idx]);
idx++;
System.out.println("City 1 population: "+population[idx]);

String str="abc";
System.out.println("City 1 population: "+population[str.length()]);

//String array cities= "Miami","Tokyo","London","Rome","New York";
String[]cities = {"Miami","Tokyo","London","Rome","New York"};
System.out.println("Ppopulation: "+population[0]+"| City: "+cities[0]);
System.out.println("Ppopulation: "+population[1]+"| City: "+cities[1]);
System.out.println("Ppopulation: "+population[2]+"| City: "+cities[2]);
System.out.println("Ppopulation: "+population[3]+"| City: "+cities[3]);
System.out.println("Ppopulation: "+population[4]+"| City: "+cities[4]);

}
	
	}