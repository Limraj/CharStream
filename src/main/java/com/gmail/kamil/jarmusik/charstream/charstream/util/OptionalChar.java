/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.kamil.jarmusik.charstream.charstream.util;

import java.util.Objects;
import java.util.OptionalInt;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 *
 * @author Kamil-Tomasz
 */
public class OptionalChar {
    
    private final OptionalInt optionalInt;

    private OptionalChar(char value) {
        this.optionalInt = OptionalInt.of(value);
    }
    
    private OptionalChar() {
        this.optionalInt = OptionalInt.empty();
    }
    
    public static OptionalChar empty() {
        return new OptionalChar();
    }

    public static OptionalChar of(char value) {
        return new OptionalChar(value);
    }

    public char getAsChar() {
        return (char)optionalInt.getAsInt();
    }

    public boolean isPresent() {
        return optionalInt.isPresent();
    }

    public void ifPresent(IntConsumer consumer) {
        optionalInt.ifPresent(consumer);
    }

    public char orElse(char other) {
        return (char) optionalInt.orElse(other);
    }

    public char orElseGet(IntSupplier other) {
        return (char) optionalInt.orElseGet(other);
    }

    public <X extends Throwable> char orElseThrow(Supplier<X> exceptionSupplier) throws X {
        return (char) optionalInt.orElseThrow(exceptionSupplier);
    }

    @Override
    public boolean equals(Object obj) {
        return optionalInt.equals(((OptionalChar)obj).optionalInt);
    }

    @Override
    public int hashCode() {
        return optionalInt.hashCode();
    }

    @Override
    public String toString() {
        return Objects.toString((char)optionalInt.getAsInt());
    }
}
