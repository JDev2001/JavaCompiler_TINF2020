package Example;

class Test {
    int j;
    int h;
    public Returner returner;

    public Test() {
        j = 32;
        h = 32;
        returner = new Returner();
    }

    public int whatsMyj() {
        return returner.returnIt(j);
    }

    public int moreThanh() {
        return returner.returnMore(h);
    }
}

class Returner {
    public int returnIt(int i) {
        return i;
    }

    public int returnMore(int i) {
        return i+1;
    }
}