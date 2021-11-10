package test.java;

import main.java.pluralsight.MapReduceStringDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class TestMapReduceStringDemo {
        private String expectedOutput;
        private List<String> input;
        MapReduceStringDemo demo = new MapReduceStringDemo();

        public TestMapReduceStringDemo(List<String> input, String expectedOutput){
                super();
                this.input = input;
                this.expectedOutput = expectedOutput;
                System.out.println("1");
        }
        @Parameters
        public static Collection<String[]> testConditions(){
                System.out.println("2");
                String expectedOutputs[][] = {
                        {"corejava", "spring", "hibernate"}
                        };
                System.out.println("3");
                return Arrays.asList(expectedOutputs);
        }
        @Test
        public void testCalculateLongestString(){
                System.out.println("4");
                assertEquals(expectedOutput, demo.calculateLongestString(input));
        }

}
