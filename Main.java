public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");

        Marco();

        favStuff("Red", 22);
    }

    public static void Marco() {
        System.out.println("Polo");
    }

    static void favStuff(String favColor, int favNumber) {
    System.out.println("My favorite color is " + favColor + " and my favorite number is " + favNumber);
    }
}