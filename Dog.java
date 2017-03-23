public class Dog {

	public static  void main(String args[]){
		Dogie f = new Dogie ("Dodo", 3);
		System.out.println(f);
			}
	}
	class Dogie {
		
		int Age;
		String Name;
		Dogie (String Name, int Age){
			this.Age=Age;
			this.Name=Name;
		}
		public String toString() {
		    return ("I am a Dogi, but you can call me " + Name +
		            ". My  age is " + Age);
		}
		
	}
	