package object;

class Bicycle {
	
	 private String name;
	    private String color;
	    private int distance = 0;

	    Bicycle(String name, String color) {
	      this.name = name;
	      this.color = color;
	    }

	    public void printData() {
	      System.out.println("¼OF" + this.name);
	      System.out.println("FF" + this.color);
	      System.out.println("s£F" + this.distance + "km");
	    }

	    public void run(int distance) {
	      System.out.println(distance + "kmèÜ·");
	      this.distance += distance;
	      System.out.println("s£F" + this.distance + "km");
	    }
	  }