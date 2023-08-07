import menu.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        while (true) {
            switch (menu.publicMenu()) {
                case 1 -> menu.enterMenu();
                case 2 -> menu.registerMenu();
                case 3 -> {
                    System.out.println("Have a good day!");
                    System.exit(0);
                }
                case 0 -> System.out.println("you Enter a wrong number!");
            }
        }
    }
}
