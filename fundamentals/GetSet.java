package fundamentals;

public class GetSet {
    // Private fields to store the name and age
    // 'private' means that these fields are only accessible within the class
    private String name;
    private int age;

    // Public method to set the name
    // Allows controlled access to the private 'name' field
    public void setName(String newName) {
        this.name = newName;
    }

    // Public method to get the name
    // Provides access to the private 'name' field
    public String getName() {
        return name;
    }

    // Public method to set the age
    // Allows controlled access to the private 'age' field
    public void setAge(int newAge) {
        this.age = newAge;
    }

    // Public method to get the age
    // Provides access to the private 'age' field
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create an instance of GetSet
        GetSet person = new GetSet();
        
        // Set the name using setName method
        person.setName("Alice");
        
        // Set the age using setAge method
        person.setAge(25);
        
        // Get the name using getName method
        System.out.println("Name: " + person.getName());  // Output: Name: Alice
        
        // Get the age using getAge method
        System.out.println("Age: " + person.getAge());  // Output: Age: 25
    }
}
