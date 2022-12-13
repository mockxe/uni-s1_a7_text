package io.mockxe.uni.s1.a7.text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextDocumentTest {

    @Test
    void testUndoTextDocument() {
        TextDocument textDocument = new TextDocument("Hello World!");
        TextDocument undo = textDocument.undo();
        assert textDocument == undo;
    }

    @Test
    void testUndoModifiedTextDocument() {
        TextDocument textDocument = new TextDocument("Hello World!");
        TextDocument noop = textDocument.noop();
        TextDocument undo = noop.undo();
        assert textDocument == undo;
    }

    @Test
    void testNoop() {
        TextDocument textDocument = new TextDocument("Hello World!");
        TextDocument noop = textDocument.noop();
        assert textDocument.getContent().equals(noop.getContent());
    }

    @Test
    void testReplaceTextSection() {
        TextDocument textDocument = new TextDocument("Hello Aachen!");
        TextDocument replace = textDocument.replaceTextSection(6, 12, "World");

        System.out.println(textDocument.getContent());
        assert textDocument.getContent().equals("Hello Aachen!");

        System.out.println(replace.getContent());
        assert replace.getContent().equals("Hello World!");
    }

    @Test
    void testAddTextAt() {
        TextDocument textDocument = new TextDocument("Hello!");
        TextDocument added = textDocument.addTextAt(5, " World");

        System.out.println(textDocument.getContent());
        assert textDocument.getContent().equals("Hello!");

        System.out.println(added.getContent());
        assert added.getContent().equals("Hello World!");
    }

    @Test
    void testRemoveTextSection() {
        TextDocument textDocument = new TextDocument("Hello World!");
        TextDocument removed = textDocument.removeTextSection(5, 11);

        System.out.println(textDocument.getContent());
        assert textDocument.getContent().equals("Hello World!");

        System.out.println(removed.getContent());
        assert removed.getContent().equals("Hello!");
    }

}