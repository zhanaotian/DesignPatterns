package jkwar.code.builder;

//具体的 MicrosoftBuilder 类
public class MicrosoftBuilder extends Builder{
    private Computer mComputer = new Microsoft();

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
