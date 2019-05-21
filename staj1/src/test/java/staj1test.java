/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class staj1test {
    
private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
private final PrintStream originalOut = System.out;
private final PrintStream originalErr = System.err;

  @Before
public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
}

@After
public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
}
    
    
@Test
public void out1() {
   staj1 staj1 = new staj1();
staj1.tree(1);
String expected = " \n"+"*\n";
assertEquals(expected, outContent.toString());
}
@Test
public void out3() {
   staj1 staj1 = new staj1();
staj1.tree(3);
String expected = "   \n"+"  *\n"+" ***\n"+"*****\n";
assertEquals(expected, outContent.toString());
}
}
