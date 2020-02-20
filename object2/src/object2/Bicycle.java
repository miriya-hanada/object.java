package object2;

class Bicycle extends Vehicle {
  Bicycle(String name, String color) {
    super(name, color);
  }

  public void run(int distance) {
    System.out.println(distance + "kmëñÇËÇ‹Ç∑");
    this.distance += distance;
    System.out.println("ëñçsãóó£ÅF" + this.distance + "km");
  }
}
