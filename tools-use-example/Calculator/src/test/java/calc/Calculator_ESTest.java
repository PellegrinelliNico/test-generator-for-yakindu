/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 23 14:30:44 GMT 2023
 */

package calc;

import org.junit.Test;
import static org.junit.Assert.*;
import calc.Calculator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Calculator_ESTest extends Calculator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = Calculator.isEven(2439);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = Calculator.sum(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = Calculator.sum(2122, 0);
      assertEquals(2122, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Calculator.minus(256, 256);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = Calculator.minus(1416, 3019);
      assertEquals((-1603), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      boolean boolean0 = Calculator.isEven(1208);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      boolean boolean0 = Calculator.isEven((-1603));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Calculator calculator0 = new Calculator();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int int0 = Calculator.sum((-1), (-1043));
      assertEquals((-1044), int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      int int0 = Calculator.minus(1416, (-797));
      assertEquals(2213, int0);
  }
}
