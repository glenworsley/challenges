package com.example.challenges;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class StdInOutTest {

    @Test
        public void testStdInOut() {

        String threeLinesInput = "54\n324.123\nThis is a longer line\n";
        InputStream in = new ByteArrayInputStream(threeLinesInput.getBytes());

        Scanner scan = new Scanner(in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); //to "eat" the \n char
        String s = scan.nextLine();

        assertThat(i, is(equalTo(54)));
        assertThat(d, is(equalTo(324.123)));
        assertThat(s, is(equalTo("This is a longer line")));

        scan.close();
    }


    @Test
    public void testFormattedPrint() {

        String x = "cpp";
        int y = 55;
        System.out.printf("%1$-15s %2$03d", x, y);
    }


    @Test
    public void testMultiplier() {

        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }


    @Test
    public void testSeries() {

//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            //code goes here
//            System.out.printf("a=%d, b=%d, n=%d", a, b, n);
//            functionUnderTest(a,b,n);
//
//        }
//        in.close();


        List<Integer> result = Arrays.asList( new Integer[] { 2, 6, 14, 30, 62, 126, 254, 510, 1022, 2046} );
        assertThat(functionUnderTest(0,2,10), is(equalTo(result)));
    }

    private List<Integer> functionUnderTest(int a, int b, int n) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = a;
            for (int j = 0; j <= i; j++) {
                x = x + b * (int) Math.pow(2d, j);
            }
            result.add(x);
        }

        return result;
    }


    @ParameterizedTest
    @CsvSource ({ "-100,-100 can be fitted in:* byte* short* int* long" ,
            "0,0 can be fitted in:* byte* short* int* long",
            "-150,-150 can be fitted in:* short* int* long",
            "213333333333333333333333333333333333,213333333333333333333333333333333333 can't be fitted anywhere.",
            "-100000000000000,-100000000000000 can be fitted in:* long"})
    void dataTypes(String input, String expected) {

        String actual = "";
        List<String> result = new ArrayList<>();
        try {
            long l = Long.parseLong(input);
            result.add("* long");
            if (l >= Integer.MIN_VALUE && l <= Integer.MAX_VALUE) {
                result.add("* int");
                if (l >= Short.MIN_VALUE && l <= Short.MAX_VALUE) {
                    result.add("* short");
                    if (l >= Byte.MIN_VALUE && l <= Byte.MAX_VALUE) {
                        result.add("* byte");
                    }
                }
            }
            result.add(l + " can be fitted in:");
            Collections.reverse(result);
            actual = result.stream().collect(Collectors.joining());
            result.stream().forEach(System.out::println);

        }
        catch (NumberFormatException e) {
            actual = input + " can't be fitted anywhere.";
        }
        assertThat(actual, is(equalTo(expected)));

    }
}
