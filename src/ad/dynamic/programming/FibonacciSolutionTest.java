package ad.dynamic.programming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FibonacciSolutionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testFindFibonacciNumberUsingRecursion() {
		// eg. fibonacci series
		// series: 0 1 1 2 3 5 8 13 21 34
		// index:  0 1 2 3 4 5 6 7  8  9
		assertEquals(FibonacciSolution.findFibonacciNumberUsingRecursion(0), 0);
		assertEquals(FibonacciSolution.findFibonacciNumberUsingRecursion(1), 1);
		assertEquals(FibonacciSolution.findFibonacciNumberUsingRecursion(2), 1);
		assertEquals(FibonacciSolution.findFibonacciNumberUsingRecursion(6), 8);
		assertEquals(FibonacciSolution.findFibonacciNumberUsingRecursion(8), 21);
		assertEquals(FibonacciSolution.findFibonacciNumberUsingRecursion(9), 34);
		//assertEquals(FibonacciSolution.findFibonacciNumberUsingRecursion(30), 832040);
	}

	@Test
	void testFindFibonacciNumbersUsingMemoization() {
		// eg. fibonacci series
		// series: 0 1 1 2 3 5 8 13 21 34
		// index:  0 1 2 3 4 5 6 7  8  9
		assertEquals(FibonacciSolution.findFibonacciNumberUsingMemoization(0), 0);
		assertEquals(FibonacciSolution.findFibonacciNumberUsingMemoization(1), 1);
		assertEquals(FibonacciSolution.findFibonacciNumberUsingMemoization(2), 1);
		assertEquals(FibonacciSolution.findFibonacciNumberUsingMemoization(6), 8);
		assertEquals(FibonacciSolution.findFibonacciNumberUsingMemoization(8), 21);
		assertEquals(FibonacciSolution.findFibonacciNumberUsingMemoization(9), 34);
		//assertEquals(FibonacciSolution.findFibonacciNumberUsingMemoization(30), 832040);
	}

}
