package io.mockxe.uni.s1.a7.text;

public class AddTextAtOperation extends Operation {

    private int position;

    private String addition;


    public AddTextAtOperation(int position, String addition) {
        this.position = position;
        this.addition = addition;
    }


    @Override
    public TextDocument apply(TextDocument current) {
        return current.addTextAt(position, addition);
    }

}
