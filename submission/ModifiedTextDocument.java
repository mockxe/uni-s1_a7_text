public class ModifiedTextDocument extends TextDocument {

    private TextDocument previousVersion;


    public ModifiedTextDocument(String content, TextDocument previousVersion) {
        super(content);
        this.previousVersion = previousVersion;
    }


    @Override
    public TextDocument undo() {
        return previousVersion;
    }

}
