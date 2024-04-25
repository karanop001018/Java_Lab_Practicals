class ArgumentGreaterThanOne extends Exception {
    ArgumentGreaterThanOne(String message) {
        super(message);
    }
}
public class practical_30 {
    public static void main(String[] args) throws ArgumentGreaterThanOne {
        try {
            if (args.length> 1) {
                throw new ArgumentGreaterThanOne("More than one argument provided.");
            } else {
                System.out.println("Successfully ran without Exception.");
            }
        } catch (ArgumentGreaterThanOne e) {
            System.out.println(e.getMessage());
        }
    }
}
