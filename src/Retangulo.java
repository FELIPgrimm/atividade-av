abstract class Retangulo {
    protected String text;
    protected int width;
    protected int height;

    public Retangulo(String text, int width, int height) {
        this.text = text;
        this.width = width;
        this.height = height;
    }

    public abstract void draw();
}
