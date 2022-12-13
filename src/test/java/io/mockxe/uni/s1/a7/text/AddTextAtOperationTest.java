package io.mockxe.uni.s1.a7.text;

import org.junit.jupiter.api.Test;

class AddTextAtOperationTest {

    @Test
    void testAddTextAtOperation() {
        TextDocument textDocument = new TextDocument("Hello!");
        Operation operation = new AddTextAtOperation(5, " World");

        TextDocument modifiedDocument = operation.apply(textDocument);

        assert modifiedDocument.getContent().equals("Hello World!");
    }

}