/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.kamil.jarmusik.charstream.charstream;

import com.gmail.kamil.jarmusik.charstream.charstream.stream.CharStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Kamil-Tomasz
 */
public class Start {
    public static void main(String[] args) {
        char[] abc = {'a','b','c', 'c', 'c', 'd'};
        List<Character> list = CharStream.of(abc).distinct().boxed().collect(Collectors.toList());
        List<Character> list1 = CharStream.of(abc).boxed().collect(Collectors.toList());
        System.out.println(list1);
        char[] chars = CharStream.of(abc).distinct().filter(a -> a == 'a').toArray();
        System.out.println(Arrays.toString(chars));
        //OptionalChar optional = CharStream.of(abc).allMatch(a -> a == 'a');
        //System.out.println(optional);
        //IntStream.builder().add(0)
        //System.out.println(optional);
        int[] abc1 = {6,2,3,1, 7, 9, 12};
        List<Integer> ints1 = IntStream.of(abc1).flatMap((int value) -> {
            int[] abc2 = {};
            switch(value) {
                case 1: abc2 = new int[] {2,12}; break;
                case 2: abc2 = new int[] {3,7,9};
            }
            return IntStream.of(abc2); 
        }).map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand/2;
            }
        }).boxed().collect(Collectors.toList());
        System.out.println(ints1);
        
        char[] abc12 = {'a','4', 'ź', 'z'};
        List<Character> ints12 = CharStream.of(abc12).map(a -> a + 1000000000).map(a -> a - 1000000000).boxed().collect(Collectors.toList());
        System.out.println(ints12);
    }
}
