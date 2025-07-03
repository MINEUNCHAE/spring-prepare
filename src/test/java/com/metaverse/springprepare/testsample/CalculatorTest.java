package com.metaverse.springprepare.testsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
@DisplayName("계산기 테스트")
class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1(){

        //given(주어진 값 선언)
        Calculator calculator = new Calculator();
        int num1=8;
        int num2=2;
        String op="+";

        //when(테스트에 사용될 값)
        Double result= calculator.operate(num1, op, num2);
        System.out.println("result ="+result);

        //then(결과)
        Assertions.assertEquals(10, result);


    }
    @Test
    @DisplayName("나누기 테스트")
    void test2(){

        //given(주어진 값 선언)
        Calculator calculator = new Calculator();
        int num1=8;
        int num2=2;
        String op="/";

        //when(테스트에 사용될 값)
        Double result= calculator.operate(num1, op, num2);
        System.out.println("result ="+result);

        //then(결과)
        Assertions.assertEquals(4, result);


    }

    @Test
    @DisplayName("빼기 테스트")
    void test3() {

        //given(주어진 값 선언)
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 2;
        String op = "-";

        //when(테스트에 사용될 값)
        Double result = calculator.operate(num1, op, num2);
        System.out.println("result =" + result);

        //then(결과)
        Assertions.assertEquals(6, result);


    }

    @Test
    @DisplayName("곱하기 테스트")
    void test4() {

        //given(주어진 값 선언)
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 2;
        String op = "*";

        //when(테스트에 사용될 값)
        Double result = calculator.operate(num1, op, num2);
        System.out.println("result =" + result);

        //then(결과)
        Assertions.assertEquals(16, result);


    }
    @Test
    @DisplayName("예외테스트")
    void test5() {

        //given(주어진 값 선언)
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 2;
        String op = "%";

        //when& then(결과)// 이런 예외 과정도 변수로 만들 수 있다
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.operate(num1, op, num2));

        Assertions.assertEquals( "잘못된 연산자 입니다.", thrown.getMessage());


    }
    @Test
    @DisplayName("NULL예외상황")
    void test6() {

        //given(주어진 값 선언)
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 0; //NULL
        String op = "/";

        Double result = calculator.operate(num1, op, num2);
        System.out.println("result =" + result);

        //then(결과)
        Assertions.assertNull(result);



    }

}


//ctrl+alt+l