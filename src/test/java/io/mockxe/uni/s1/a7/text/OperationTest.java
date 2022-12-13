package io.mockxe.uni.s1.a7.text;

import org.junit.jupiter.api.Test;

class OperationTest {

    @Test
    void testOperation() {
        TextDocument textDocument = new TextDocument("Hello World!");
        Operation operation = new Operation();

        TextDocument modifiedDocument = operation.apply(textDocument);

        assert modifiedDocument.getContent().equals(textDocument.getContent());
    }

}