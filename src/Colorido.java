public class Colorido extends Retangulo {
    private String borderColor;
    private String textColor;

    // ANSI escape codes for colors
    private static final String RESET = "\u001B[0m";
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String WHITE = "\u001B[37m";

    public Colorido(String text, int width, int height, String borderColor, String textColor) {
        super(text, width, height);
        this.borderColor = borderColor;
        this.textColor = textColor;
    }

    private String getColorCode(String color) {
        return switch (color.toLowerCase()) {
            case "black" -> BLACK;
            case "red" -> RED;
            case "green" -> GREEN;
            case "yellow" -> YELLOW;
            case "blue" -> BLUE;
            case "purple" -> PURPLE;
            case "cyan" -> CYAN;
            case "white" -> WHITE;
            default -> RESET;
        };
    }

    @Override
    public void draw() {
        String borderC = getColorCode(borderColor);
        String textC = getColorCode(textColor);

        System.out.println(borderC + "╭" + "─".repeat(width - 2) + "╮" + RESET);
        System.out.println(borderC + "│" + textC + String.format("%-" + (width - 2) + "s", text) + borderC + "│" + RESET);
        System.out.println(borderC + "╰" + "─".repeat(width - 2) + "╯" + RESET);
    }
}
