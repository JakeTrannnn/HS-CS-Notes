public class InputApp {
    public static void main(String[] args) {
        Scanner in = new Scanner();
        System.out.println("Please enter the amount of books you own: ")
        int books = in.nextInt();
        System.out.println("Cool! You have %d", books);
    }
}