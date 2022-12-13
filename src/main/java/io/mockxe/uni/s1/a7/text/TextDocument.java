package io.mockxe.uni.s1.a7.text;

public class TextDocument {

    private String content;


    public TextDocument(String content) {
        this.content = content;
    }


    public TextDocument undo() {
        return this;
    }


    public String getContent() {
        return content;
    }

}
