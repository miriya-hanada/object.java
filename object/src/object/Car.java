package object;

class Car {
	
	 private String name;
	    private String color;
	    private int distance = 0;
	    private int fuel = 100;

	    Car(String name, String color) {
	      this.name = name;
	      this.color = color;
	    }

	    public void printData() {
	      System.out.println("���O�F" + this.name);
	      System.out.println("�F�F" + this.color);
	      System.out.println("���s�����F" + this.distance + "km");
	      System.out.println("�K�\�����ʁF" + this.fuel + "L");
	    }
	    public void run(int distance) {
	      System.out.println(distance + "km����܂�");
	      if (distance <= fuel) {
	        this.distance += distance;
	        this.fuel -= distance;
	        } else {
	        System.out.println("�K�\����������܂���");
	      }
	      System.out.println("���s�����F" + this.distance + "km");
	      System.out.println("�K�\�����ʁF" + this.fuel + "L");
	    }
	    public void charge(int litre) {
	      System.out.println(litre + "L�������܂�");
	      if (litre <= 0) {
	        System.out.println("�����ł��܂���");
	      } else if (litre + this.fuel >= 100) {
	        System.out.println("���^���܂ŋ������܂�");
	         this.fuel = 100;
	      } else {
	        this.fuel += litre;
	      }
	      System.out.println("�K�\�����ʁF" + this.fuel + "L");
	    }
	  }