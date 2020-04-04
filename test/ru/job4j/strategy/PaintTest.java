package ru.job4j.strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void showTriangle() {
        PrintStream stdOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint paint = new Paint();
        paint.draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder("     ^     ").append(System.lineSeparator())
                                .append("    ^ ^    ").append(System.lineSeparator())
                                .append("   ^   ^   ").append(System.lineSeparator())
                                .append("  ^     ^  ").append(System.lineSeparator())
                                .append(" ^       ^ ").append(System.lineSeparator())
                                .append("^^^^^^^^^^^").append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdOut);
    }

    @Test
    public void showSquare() {
        PrintStream stdOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint paint = new Paint();
        paint.draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder("XXXXXXXXX").append(System.lineSeparator())
                                .append("X       X").append(System.lineSeparator())
                                .append("X       X").append(System.lineSeparator())
                                .append("XXXXXXXXX").append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdOut);
    }
}
