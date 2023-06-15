public class Leaf implements Component{
    private String name;
    private int size;

    public Leaf(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println("File: " + name);
    }

    @Override
    public int getSize() {
        return size;
    }
}
