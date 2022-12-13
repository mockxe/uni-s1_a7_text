package io.mockxe.uni.s1.a7.text;

import org.junit.jupiter.api.Test;

class RemoveTextSectionOperationTest {

    @Test
    void testRemoveTextSectionOperation() {
        TextDocument textDocument = new TextDocument("Hello World!");
        Operation operation = new RemoveTextSectionOperation(5, 11);

        TextDocument modifiedDocument = operation.apply(textDocument);

        assert modifiedDocument.getContent().equals("Hello!");
    }

}