public class Main {
    public static void main(String[] args) {
        Retangulo arredondado = new Arredondado("Arredondado", 20, 5);
        Retangulo linhaDupla = new LinhaDupla("Linha Dupla", 20, 5);
        Retangulo asciiArt = new AsciiArt("ASCII Art", 20, 5);
        Retangulo colorido = new Colorido("Colorido", 20, 5, "blue", "yellow");


        arredondado.draw();
        System.out.println();

        linhaDupla.draw();
        System.out.println();
        asciiArt.draw();

        colorido.draw();
    }
}
