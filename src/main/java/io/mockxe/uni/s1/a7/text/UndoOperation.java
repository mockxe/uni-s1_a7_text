package io.mockxe.uni.s1.a7.text;

public class UndoOperation extends Operation {

    @Override
    public TextDocument apply(TextDocument current) {
        return current.undo();
    }

    @Override
    public String getDescription() {
        return "reverts the previous operation";
    }

}
