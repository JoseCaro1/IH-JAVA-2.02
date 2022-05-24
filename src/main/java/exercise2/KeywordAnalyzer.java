package exercise2;

public class KeywordAnalyzer {

    private static String[] keywords = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package",
            "synchronized", "boolean", "do", "if", "private", "this", "break",
            "double", "implements", "protected", "throw", "byte", "else", "import", "public",
            "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends",
            "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally",
            "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};

    public static boolean reservedWords(String words) {

        if (words == null) {
            throw new IllegalArgumentException();
        }
        String[] palabras = words.split(" ");

        for (String palabra : palabras) {

            for (String word : keywords) {
                if (word.equalsIgnoreCase(palabra)) {
                    return true;
                }

            }

        }
        return false;
    }
}
