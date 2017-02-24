package com.pillartechnology.fizzbuzzbang;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzBangTest {

    FizzBuzzBang testFBB = new FizzBuzzBang();

    @Test
    public void when_given_a_number_it_is_turned_into_a_String_and_returned() {
        assertEquals("1", testFBB.beginFizzBuzzBang(1));
        assertEquals("19", testFBB.beginFizzBuzzBang(19));
    }

    @Test
    public void when_given_a_number_divisible_by_three_isNumberDivisibleByThree_returns_true() {
        assertEquals(true, testFBB.isNumberDivisibleByThree(3));
    }

    @Test
    public void when_given_a_number_9_divisible_by_three_isNumberDivisibleByThree_returns_true() {
        assertEquals(true, testFBB.isNumberDivisibleByThree(9));
    }

    @Test
    public void when_beginFizzBuzzBang_is_given_a_number_divisible_by_three_returns_fizz() throws Exception {
        assertEquals("fizz", testFBB.beginFizzBuzzBang(3));
    }

    @Test
    public void when_beginFizzBuzzBang_is_given_a_number_9_divisible_by_three_returns_fizz() throws Exception {
        assertEquals("fizz", testFBB.beginFizzBuzzBang(9));
    }

    @Test
    public void when_given_a_number_isNumberDivisibleByFive_returns_true() {
        assertEquals(true, testFBB.isNumberDivisibleByFive(10));
    }

    @Test
    public void when_given_a_number_15_isNumberDivisibleByFive_returns_true() {
        assertEquals(true, testFBB.isNumberDivisibleByFive(15));
    }

    @Test
    public void when_beginFizzBuzzBang_is_given_a_number_divisible_by_five_returns_buzz() {
        assertEquals("buzz", testFBB.beginFizzBuzzBang(5));
    }

    @Test
    public void when_given_a_number_divisible_by_seven_isNumberDivisibleBySeven_returns_true() {
        assertEquals(true, testFBB.isNumberDivisibleBySeven(7));
    }

    @Test
    public void when_beginFizzBuzzBang_is_given_a_number_divisible_by_seven_returns_bang() {
        assertEquals("bang", testFBB.beginFizzBuzzBang(7));
    }

    @Test
    public void when_beginFizzBuzzBang_is_given_a_number_divisible_by_three_and_five_returns_fizzBuzz() {
        assertEquals("fizzBuzz", testFBB.beginFizzBuzzBang(15));

    }

    @Test
    public void when_beginFizzBuzzBang_is_given_a_number_divisible_by_three_and_seven_returns_fizzBang() {
        assertEquals("fizzBang", testFBB.beginFizzBuzzBang(21));

    }

    @Test
    public void when_beginFizzBuzzBang_is_given_a_number_divisible_by_five_and_seven_returns_buzzBang() {
        assertEquals("buzzBang", testFBB.beginFizzBuzzBang(35));
    }

    @Test
    public void when_beginFizzBuzzBang_is_given_a_number_divisible_by_three_five_and_seven_returns_fizzBuzzBang() {
        assertEquals("fizzBuzzBang", testFBB.beginFizzBuzzBang(105));

    }

    @Test
    public void when_beginFizzBuzzBang_is_given_a_number_divisible_210_by_three_five_and_seven_returns_fizzBuzzBang() {
        assertEquals("fizzBuzzBang", testFBB.beginFizzBuzzBang(210));

    }


}