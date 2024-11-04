package PACKAGE_NAME;

public class TEST {
  public static void main(String[] args) {
        AddAndGet();
        testDelete();
    }
    public static void AddAndGet() {
        Container<String> container = new Container<>();
        container.add("Element1");
        container.add("Element2");
        container.add("Element3");
        System.out.println("TEST 1:");
        for (int i = 0; i < container.size(); i++) {
            System.out.println(container.get(i));
        }
    }
    public static void testDelete(){
        Container<String> container = new Container<>();
        container.add("Element1");
        container.add("Element2");
        container.add("Element3");
        container.delete(1);
        System.out.println("TEST 2:");
        for (int i = 0; i < container.size(); i++) {
            System.out.println(container.get(i));
        }
    }
}
