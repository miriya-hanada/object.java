package object;

import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    Bicycle bicycle = new Bicycle("�r�A���L", "��");
	    System.out.println("�y���]�Ԃ̏��z");
	    bicycle.printData();
	    System.out.println("-----------------");
	    System.out.print("���鋗������͂��Ă��������F");
	    int bicycleDistance = scanner.nextInt();
	    bicycle.run(bicycleDistance);

	    System.out.println("=================");
	    Car car = new Car("�t�F���[��", "��");
	    System.out.println("�y�Ԃ̏��z");
	    car.printData();
	    System.out.println("-----------------");
	    System.out.print("���鋗������͂��Ă��������F");
	    int carDistance = scanner.nextInt();
	    car.run(carDistance);

	    System.out.println("-----------------");
	    System.out.print("��������ʂ���͂��Ă��������F");
	    int litre = scanner.nextInt();
	    car.charge(litre);


	  }
	}