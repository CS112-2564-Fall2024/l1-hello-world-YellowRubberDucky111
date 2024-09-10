public class Fish {
    String name;
    String color;
    // double weight =
    // double length =

    // Constructor, Default
    public Fish() {
        this.name = "Goldfish";
    }

    // Constructor, Full
    public Fish(String name) {
        this.name = name;

        // secretly returns this
    }

    // Getters
    public String GetName() {
        return name;
    }

    // Setters
    public void SetName(String newName) {

    }

    // toString
    public String toString() {
        return name;
    }

    // Equals
    public boolean equals(Fish otherFish) {
        if (this.name.equals(otherFish.name)) {
            return true;
        } else {
            return false;
        }
    }

}
