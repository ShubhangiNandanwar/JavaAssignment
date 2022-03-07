
class Animalss {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animalss {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dogs extends Animalss {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class PolymorphismEx {
  public static void main(String[] args) {
    Animalss myAnimal = new Animalss();
    Animalss myPig = new Pig();
    Animalss myDog = new Dogs();
        
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}