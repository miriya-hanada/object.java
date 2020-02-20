package object2;

class Car extends Vehicle {
  private int fuel = 50;

  Car(String name, String color) {
    super(name, color);
  }

  public int getFuel() {
    return this.fuel;
  }

  public void printData() {
    super.printData();
    System.out.println("�K�\�����ʁF" + this.fuel + "L");
  }

  public void run(int distance) {
    System.out.println(distance + "km����܂�");
    if (distance <= this.fuel) {
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
