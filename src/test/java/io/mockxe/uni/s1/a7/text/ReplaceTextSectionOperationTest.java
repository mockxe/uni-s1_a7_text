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

}