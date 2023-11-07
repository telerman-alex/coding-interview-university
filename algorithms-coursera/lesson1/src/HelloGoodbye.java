public class HelloGoodbye {

    public static void main(String[] args) {
        assert args.length == 2;
        System.out.printf("Hello %s and %s." + System.lineSeparator(), args[0], args[1]);
        System.out.printf("Goodbye %s and %s." + System.lineSeparator(), args[1], args[0]);
    }
}
