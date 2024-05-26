package interfaces;

interface Printable {
    void print();
    
    default void printInfo() {
        System.out.println("This is a printable object.");
    }
}

class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document.");
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.printInfo();
    }
}
