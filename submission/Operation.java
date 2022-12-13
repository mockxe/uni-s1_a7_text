public class Operation {

    public TextDocument apply(TextDocument current) {
        return  current.noop();
    }

    public String getDescription() {
        return "does not modify the document";
    }

}
