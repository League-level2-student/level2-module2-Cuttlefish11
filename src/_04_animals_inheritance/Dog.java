package _04_animals_inheritance;

public class Dog extends Animal{
		Dog(String name, String color, boolean isAGoodPet) {
			super(name,color,isAGoodPet);
			// TODO Auto-generated constructor stub
		}
		void sleep() {
			super.sleep(name);	
			}
			void play(){
			super.play(name);	
			}
			void eat() {
			super.eat(name);	
			}
			public String printName() {
				return super.printName(name);
				
			}
}
