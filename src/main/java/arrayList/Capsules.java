package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> colorOfCapsules = new ArrayList<>();

    public void addLast(String color) {
        colorOfCapsules.add(color);
    }

    public void addFirst(String color) {
        colorOfCapsules.add(0, color);
    }

    public void removeFirst() {
        colorOfCapsules.remove(0);
    }

    public void removeLast() {
        colorOfCapsules.remove(colorOfCapsules.size() - 1);
    }

    public List<String> getColors() {
        return colorOfCapsules;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addFirst("red");
        capsules.addFirst("green");
        capsules.addFirst("blue");
        System.out.println(capsules.getColors());
        capsules.addLast("grey");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
