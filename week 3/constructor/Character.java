public class Character {
    // Attributes
    int age;
    String color;
    String behavior;
    String name;

    // Method
    public void sayMyName() {
        System.out.println("\n"+ "Meow I am " + name);
    }

    // Constructor
    public Character(int age, String catColor, String catBehavior, String catName) {
        age = age;
        color = catColor;
        behavior = catBehavior;
        name = catName;
    }
}
