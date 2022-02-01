package _04_animals_inheritance;

public class Animal {
String name;
String color;
boolean isAGoodPet;
Animal(String name1, String color1, boolean isAGoodPet1){
	name = name1;
	color = color1;
	isAGoodPet = isAGoodPet;
}
public void play(String name) {
System.out.println(name + " begins to run around and play.");
}
public void sleep(String name) {
	System.out.println(name + " falls into a deep sleep.");	
}
public void eat(String name) {
	System.out.println(name + " polishes off a huge can of pet food.");
}
public String printName(String name) {
	System.out.println(name);
	return name;
}
}
