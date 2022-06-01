public class ByteCodeExampleClass {
    private int i;
    private int j;
    public Returner returner;

    public ByteCodeExampleClass() {
        this.i = 32;
        this.j = 36;
        returner = new Returner();
    }

    public int whatsMyI() {
        return returner.returnIt(i);
    }

    public int moreThanJustJ() {
        return returner.returnMore(j);
    }
}

public class Returner {
    public int returnIt(int i) {
        return i;
    }

    public int returnMore(int i) {
        return i+1;
    }
}