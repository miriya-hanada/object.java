package object2;

class Person {
	  private String firstName;
	  private String middleName;
	  private String lastName;
	  private int age;
	  private double height;
	  private double weight;

	  Person(String firstName, String lastName, int age, double height, double weight) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	  }

	  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
	    this(firstName, lastName, age, height, weight);
	    this.middleName = middleName;
	  }
	  
	  public String fullName() {
	    if (this.middleName == null) {
	      return this.firstName + " " + this.lastName;
	    } else {
	      return this.firstName + " " + this.middleName + " " + this.lastName;
	    }
	  }

	  public void printData() {
	    System.out.println("���O��" + this.fullName() + "�ł�");
	    System.out.println("�N���" + this.age + "�΂ł�");
	    System.out.println("�g����" + this.height + "m�ł�");
	    System.out.println("�̏d��" + this.weight + "kg�ł�");
	    System.out.println("BMI��" + Math.round(this.bmi()) + "�ł�");
	  }

	  public double bmi() {
	    return this.weight / this.height / this.height;
	  }
	  
	  // �ȉ�2����̃��\�b�h�ŏ��������Ă�������
	 public void buy(Vehicle vehicle) {
	   vehicle.setOwner(this);
	 }

	}
