package com.gmail.kamil.jarmusik.charstream.charstream.stream

import spock.lang.Specification

class CharStreamSpec extends Specification {

    def subject;
    def exceptCharacters = Mock(List)
    def chars = Mock(char[])
    //CharStream charStream

    void setup() {
        chars >> ['a', 'c', 'c', 'c', 'b', 'd', 'f', 'e', 'a']
        subject = CharStream.of(chars);
        expectedCharacters >> ['a', 'c', 'c', 'c', 'b', 'd', 'f', 'e', 'a']
    }

    def "test of"() {
        given:
            CharStream charStream = CharStream.of(chars)
        when:
            List<Character> characters = charStream.boxed().collect(Collectors.toList())
        then:
            expectedCharacters = characters
    }

    def "test of1"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test noneMatch"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test allMatch"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test anyMatch"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test toArray"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test forEachOrdered"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test forEach"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test count"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test mapToObj"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test filter"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test map"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test peek"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test limit"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test skip"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test distinct"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test sorted"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test boxed"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test findFirst"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }

    def "test findAny"() {
        given:

        when:
        // TODO implement stimulus
        then:
        // TODO implement assertions
    }
}
