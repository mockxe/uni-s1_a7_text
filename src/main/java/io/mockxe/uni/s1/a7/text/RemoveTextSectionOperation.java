package io.mockxe.uni.s1.a7.text;

public class RemoveTextSectionOperation extends Operation {

    private int beginIndex;

    private int endIndex;


    public RemoveTextSectionOperation(int beginIndex, int endIndex) {
        this.beginIndex = beginIndex;
        this.endIndex = endIndex;
    }


    @Override
    public TextDocument apply(TextDocument current) {
        return current.removeTextSection(beginIndex, endIndex);
    }

}
