import java.util.Random;

public class Animal {

    // creat a private instance variable to store the animal type (e.g. "Tiger" or "Bear" or any other type of animal)
    private String animalType;
    private String animalSound = "";
    // create Static/class variable to track how many Animal objects have been created
    private static int count;
    // No-argument constructor:
    // - Creates a random animal type using the randomAnimalType() method you should write in this class
   public Animal() {
      this.animalType = randomAnimalType();
      count++;
   }
    // Write a constructor that takes an animal type parameter
   public Animal(String animalType) {
      this.animalType = animalType;
      count++;
   }
    // Create a getter/accessor method that returns the static variable that counts how many
    // animals have been instatiated
   public static int getCount() {
      return count;
   }
    // Create a getter/accessor method for returning the animal type
   public String getAnimalType() {
      return animalType;
   }
    // Create a getter/ accessor method for updating the animal type
   public String updateAnimal(String newAnimal) {
      animalType = newAnimal;
      return animalType;
   }
    // Creat a speak() method that uses the animal type and returns
    // a sound based on the animal type. You can just return a String with the animal noise
   public String speak() {
         if (animalType.equals("tiger")) {
            return "growl";
         } else if (animalType.equals("lion")) {
            return "roar";
         } else if (animalType.equals("jaguar")) {
            return  "purr";
         } else {
            return "that animal isn't in the zoo";
         }
   }

    // Create the speakBackward() method that calls speak() and returns the reversed String
   public String speakBackward() {
   String str = this.speak();
   String reversedSound = "";
      for (int x = str.length() - 1; x >= 0; x--) {
         reversedSound += str.substring(x, x+1);
      }
   return reversedSound;
   }

    // Create the toString() method which returns friendly description of the animal
   public String toString() {
      String description = "";
       if (animalType.equals("tiger")) {
            description += "Tigers are majestic, and the largest living cat species.";
         } else if (animalType.equals("lion")) {
            description += "Lions work in cooperative groups to hunt and secure food, ofter cuddling with each other.";
         } else if (animalType.equals("jaguar")) {
            description += "Jaguars are strong cats that work alone.";
         } else {
            description = "that animal isn't in the zoo";
         }
      return description;

   }
    // Create a static method called "randomAnimalType" that returns a random
    // animale type
    // HINT: Decide how many animal types you want to be able to create, pick a random number
    // and then use if/else/if statements to determine what the animal should say
   public static String randomAnimalType() {
      String animal = "";
      int randomInt = (int) Math.random() * 3;
      if (randomInt == 0) {
         animal += "tiger"; 
      } else if (randomInt == 1) {
         animal += "lion"; 
      } else if (randomInt == 2) {
         animal += "jaguar"; 
      }  
   return animal;
   }
}
