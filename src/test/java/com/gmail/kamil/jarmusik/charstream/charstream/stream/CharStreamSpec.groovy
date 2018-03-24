/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gmail.kamil.jarmusik.charstream.charstream.stream

import spock.lang.Specification

/**
 *
 * @author Kamil-Tomasz
 */
class CharStreamSpec extends Specification {
    
    CharStream charStreamMock = Mock(CharStream)
    CharStream charStreamStub = Stub(CharStream)        
    CharStream charStreamSpy = Spy(CharStream) 
    
    def "testMock"() {
        charStreamMock.distinct() >>> "";
    }
    
    def "testStub"() {
        charStreamStub.boxed();
    }
    
    def "testSpy"() {
        charStreamSpy.boxed();
    }
    
}

