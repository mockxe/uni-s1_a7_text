public class Launcher {

    public static void main(String[] args) {
        Operation[] operations = new Operation[] {
                new AddTextAtOperation(0, "Hello Aachen!"),
                new ReplaceTextSectionOperation(6, 12, "World"),
                new UndoOperation(),
                new ReplaceTextSectionOperation(0, 5, "Goodbye"),
                new RemoveTextSectionOperation(14, 15)
        };

        TextDocument textDocument = new TextDocument("");

        for (Operation operation : operations) {
            System.out.println(operation.getDescription());
            textDocument = operation.apply(textDocument);
            System.out.println(textDocument.getContent());
        }
    }

}
