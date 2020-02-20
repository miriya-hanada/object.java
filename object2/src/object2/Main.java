package object2;

class Main {
	
	public static void main(String[] args) {
	    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
	    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);

	    Car car = new Car("ƒtƒFƒ‰[ƒŠ", "Ô");
	    Bicycle bicycle = new Bicycle("ƒrƒAƒ“ƒL", "—Î");
	    
	    person1.buy(car);
	    
	    person2.buy(bicycle);

	    System.out.println("yÔ‚Ìî•ñz");
	    car.printData();
	    System.out.println("-----------------");
	    System.out.println("yÔ‚ÌŠ—LÒ‚Ìî•ñz");
	    car.getOwner().printData();

	    System.out.println("=================");
	    System.out.println("y©“]Ô‚Ìî•ñz");
	    bicycle.printData();
	    System.out.println("-----------------");
	    System.out.println("y©“]Ô‚ÌŠ—LÒ‚Ìî•ñz");
	    bicycle.getOwner().printData();
	  }
	}
