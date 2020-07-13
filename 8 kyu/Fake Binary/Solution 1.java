import java.util.stream.Collectors;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.chars().mapToObj(x -> x < '5' ? "0" : "1").collect(Collectors.joining());
    }
}