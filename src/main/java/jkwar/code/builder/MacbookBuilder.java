package jkwar.code.builder;

//具体的 MacbookBuilder 类
public class MacbookBuilder extends Builder{
    private Computer mComputer=new Macbook();

    public Builder buildBoard(String board) {
        mComputer.setBoard(board);
        return this;
    }

    public Builder buildDisplay(String display) {
        mComputer.setDisplay(display);
        return this;
    }

    public Builder buildOS() {
        mComputer.setOS();
        return this;
    }

    public Computer create() {
        return mComputer;
    }
}
