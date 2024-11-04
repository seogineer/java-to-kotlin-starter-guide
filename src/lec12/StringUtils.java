package lec12;

public class StringUtils {

    private StringUtils() {}

    public static boolean isDirectoryPath(String path) {
        return path.endsWith("/");
    }

}
