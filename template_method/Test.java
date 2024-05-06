package template_method;

public class Test {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println("Making coffee now...");
        coffee.prepare();

        System.out.println("Next order =>");
        Tea tea = new Tea();
        System.out.println("Making tea now...");
        tea.prepare();
    }
}
