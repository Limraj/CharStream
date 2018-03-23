/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.kamil.jarmusik.charstream.charstream.stream;

import com.gmail.kamil.jarmusik.charstream.charstream.util.OptionalChar;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;




/**
 *
 * @author Kamil-Tomasz
 */
public interface CharStream extends BaseStream<Character, CharStream> {
    
    static CharStream of(char... chars) {
       return new CharStreamImpl(new String(chars).codePoints());
    }
    
    static CharStream of(char value) {
       return new CharStreamImpl(IntStream.of((int)value));
    }

    boolean noneMatch(IntPredicate predicate);
    boolean allMatch(IntPredicate predicate);
    boolean anyMatch(IntPredicate predicate);
    void forEach(IntConsumer action);
    void forEachOrdered(IntConsumer action);
    char[] toArray();
    long count();
    <U> Stream<U> mapToObj(IntFunction<? extends U> mapper);
    CharStream filter(IntPredicate predicate);
    CharStream map(IntUnaryOperator mapper);
    CharStream peek(IntConsumer action);
    CharStream limit(long maxSize);
    CharStream skip(long n);
    CharStream distinct();
    CharStream sorted();
    Stream<Character> boxed();
    OptionalChar findFirst();
    OptionalChar findAny();
}
