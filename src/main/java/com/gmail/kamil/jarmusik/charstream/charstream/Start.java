/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.kamil.jarmusik.charstream.charstream;

import com.gmail.kamil.jarmusik.charstream.charstream.stream.CharStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Kamil-Tomasz
 */
public class Start {
    public static void main(String[] args) {
        char[] abc = {'a','b','c', 'c', 'c', 'd'};
        char[] abc2 = new char[]{'a','b','c', 'c', 'c', 'd'};
        
        List<Character> list = CharStream.of(abc).distinct().boxed().collect(Collectors.toList());
        CharStream.of(abc).noneMatch(a -> a == 'a');
        System.out.println(list);
        List<Character> list1 = CharStream.of(abc).boxed().collect(Collectors.toList());
        System.out.println(list1);
        char[] chars = CharStream.of(abc).distinct().filter(a -> a == 'a').toArray();
        System.out.println(Arrays.toString(chars));


    }
}
