package io.mockxe.uni.s1.a7.text;

import org.junit.jupiter.api.Test;

class UndoOperationTest {

    @Test
    void testUndoOperation() {
        TextDocument textDocument = new TextDocument("Hello World!");
        TextDocument modifiedDocument = new RemoveTextSectionOperation(5, 11).apply(textDocument);

        assert modifiedDocument.getContent().equals("Hello!");


        Operation operation = new UndoOperation();

        TextDocument undoDocument = operation.apply(textDocument);

        assert undoDocument == textDocument;
    }

}