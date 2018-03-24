/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.kamil.jarmusik.charstream.charstream.stream;

import com.gmail.kamil.jarmusik.charstream.charstream.util.OptionalChar;
import java.util.Iterator;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 *
 * @author Kamil-Tomasz
 */
class CharStreamImpl implements CharStream {
    
    private final IntStream intStream;

    CharStreamImpl(IntStream intStream) {
        this.intStream = intStream;
    }

    @Override
    public Stream<Character> boxed() {
        return intStream.mapToObj(a -> (char)a);
    }

    @Override
    public <U> Stream<U> mapToObj(IntFunction<? extends U> mapper) {
        return intStream.mapToObj(mapper);
    }

    @Override
    public CharStream distinct() {
        return new CharStreamImpl(intStream.distinct());
    }

    @Override
    public CharStream sorted() {
        return new CharStreamImpl(intStream.sorted());
    }

    @Override
    public CharStream peek(IntConsumer action) {
        return new CharStreamImpl(intStream.peek(action));
    }

    @Override
    public CharStream limit(long maxSize) {
        return new CharStreamImpl(intStream.limit(maxSize));
    }

    @Override
    public CharStream skip(long n) {
        return new CharStreamImpl(intStream.skip(n));
    }

    @Override
    public void forEach(IntConsumer action) {
        intStream.forEach(action);
    }

    @Override
    public void forEachOrdered(IntConsumer action) {
        intStream.forEachOrdered(action);
    }

    @Override
    public long count() {
        return intStream.count();
    }

    @Override
    public boolean anyMatch(IntPredicate predicate) {
        return intStream.anyMatch(predicate);
    }

    @Override
    public boolean allMatch(IntPredicate predicate) {
        return intStream.allMatch(predicate);
    }

    @Override
    public boolean noneMatch(IntPredicate predicate) {
        return intStream.noneMatch(predicate);
    }

    @Override
    public OptionalChar findFirst() {
        OptionalInt optional = intStream.findFirst();
        return optional.isPresent() ? OptionalChar.of((char) optional.getAsInt()) : OptionalChar.empty();
    }

    @Override
    public OptionalChar findAny() {
        OptionalInt optional = intStream.findAny();
        return optional.isPresent() ? OptionalChar.of((char) optional.getAsInt()) : OptionalChar.empty();
    }

    @Override
    public CharStream sequential() {
        return new CharStreamImpl(intStream.sequential());
    }

    @Override
    public CharStream parallel() {
        return new CharStreamImpl(intStream.parallel());
    }

    public static CharStream empty() {
        return new CharStreamImpl(IntStream.empty());
    }

    public static CharStream of(char t) {
        return CharStream.of(t);
    }

    public static CharStream of(char... values) {
        return CharStream.of(values);
    }

    @Override
    public Iterator<Character> iterator() {
        return boxed().iterator();
    }

    @Override
    public Spliterator<Character> spliterator() {
        return boxed().spliterator();
    }

    @Override
    public boolean isParallel() {
        return intStream.isParallel();
    }

    @Override
    public CharStream unordered() {
        return new CharStreamImpl(intStream.unordered());
    }

    @Override
    public CharStream onClose(Runnable closeHandler) {
        return new CharStreamImpl(intStream.onClose(closeHandler));
    }

    @Override
    public void close() {
        intStream.close();
    }

    @Override
    public CharStream filter(IntPredicate predicate) {
        return new CharStreamImpl(intStream.filter(predicate));
    }

    @Override
    public CharStream map(IntUnaryOperator mapper) {
        return new CharStreamImpl(intStream.map(mapper));
    }

    @Override
    public char[] toArray() {
        /*StringBuilder result = boxed().map(a -> new StringBuilder().append(a)).reduce(new StringBuilder(), (a,b) -> a.append(b));
        return result.toString().toCharArray();*/
        String result = boxed().map(Object::toString).collect(Collectors.joining());
        return result.toCharArray();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.intStream);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CharStreamImpl other = (CharStreamImpl) obj;
        if (!Objects.equals(this.intStream, other.intStream)) {
            return false;
        }
        return true;
    }
    
    

}
