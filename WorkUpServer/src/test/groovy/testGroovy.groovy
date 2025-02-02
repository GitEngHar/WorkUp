package com.example.demo.service;

import spock.lang.Specification

// spock記述をするために Specification を継承する
class ExampleSpecification extends Specification {
    Foo sut
    List<Foo> sutLists = new ArrayList<>()

    /** メソッド単位で一番最初に実行される*/
    def setup(){
        sut = new Foo()
    }

    def "should be a simple assertion"() {
        expect:
        1 == 1
    }

    def "文字列が大文字に変換される"() {
        /** 満たされるべき前提条件*/
        given: "変更対象の文字列とテスト対象のFooオブジェクトがある"
        def str = "test"
        /** 論理分割*/
        and:  "テスト対象のFooオブジェクトを生成"
        /** 検証したい振る舞い*/
        when:
        def result = sut.capitalize(str)
        /** プログラムが正しく動作しているかを検証するためのチェック */
        then: "大文字に変換されること"
        result == "TEST"
    }

    def "idの配列が正しく登録されること" () {
        when:
        sutLists.add(new Foo(id:1))
        sutLists.add(new Foo(id:2))
        sutLists.add(new Foo(id:3))
        then:
        sutLists.collect {it.id} == [1, 2, 3]
    }

    def "エラーが発生すること" () {
        when:
        def result = sut.calc(2,0)
        then:
        thrown(ArithmeticException)
    }
}
