public class LinhaDupla extends Retangulo{

    public LinhaDupla (String text, int width, int height) {
        super(text, width, height);
    }

    @Override
    public void draw() {
        System.out.println("╔" + "═".repeat(width - 2) + "╗");
        System.out.println("║" + String.format("%-" + (width - 2) + "s", text) + "║");
        System.out.println("╚" + "═".repeat(width - 2) + "╝");
    }
}
