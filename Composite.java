import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private String name;
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("Directory: " + name);

        for (Component component : components) {
            component.displayInfo();
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;

        for (Component component : components) {
            totalSize += component.getSize();
        }

        return totalSize;
    }
}
