import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String str = Input.input();
        Calc.calc(Parser.parse(str));

    }
}
