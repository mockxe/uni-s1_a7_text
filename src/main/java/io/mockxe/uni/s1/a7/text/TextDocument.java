package io.mockxe.uni.s1.a7.text;

public class TextDocument {

    private String content;


    public TextDocument(String content) {
        this.content = content;
    }


    public TextDocument undo() {
        return this;
    }

    public TextDocument noop() {
        return new ModifiedTextDocument(content, this);
    }

    public TextDocument replaceTextSection(int beginIndex, int endIndex, String replacement) {
        return new ModifiedTextDocument(
                content.substring(0, beginIndex) + replacement + content.substring(endIndex),
                this
        );
    }

    public TextDocument addTextAt(int position, String addition) {
        return new ModifiedTextDocument(
                content.substring(0, position) + addition + content.substring(position),
                this
        );
    }

    public TextDocument removeTextSection(int beginIndex, int endIndex) {
        return new ModifiedTextDocument(
                content.substring(0, beginIndex) + content.substring(endIndex),
                this
        );
    }


    public String getContent() {
        return content;
    }

}
