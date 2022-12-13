package io.mockxe.uni.s1.a7.text;

import org.junit.jupiter.api.Test;

class ReplaceTextSectionOperationTest {

    @Test
    void testReplaceTextSectionOperation() {
        TextDocument textDocument = new TextDocument("Hello Aachen!");
        Operation operation = new ReplaceTextSectionOperation(6, 12, "World");

        TextDocument modifiedDocument = operation.apply(textDocument);

        assert modifiedDocument.getContent().equals("Hello World!");
    }

    @Test
    void testRemoveTextSectionOperationDescription() {
        Operation operation = new RemoveTextSectionOperation(1, 2);
        assert operation.getDescription().equals("removes the text section from 1 to 2");
    }

}