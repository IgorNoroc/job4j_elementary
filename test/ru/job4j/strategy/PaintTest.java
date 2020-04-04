package ru.job4j.strategy;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void showTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                this.out.toString(),
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
    }

    @Test
    public void showSquare() {
        new Paint().draw(new Square());
        assertThat(
                this.out.toString(),
                is(
                        new StringBuilder("XXXXXXXXX").append(System.lineSeparator())
                                .append("X       X").append(System.lineSeparator())
                                .append("X       X").append(System.lineSeparator())
                                .append("XXXXXXXXX").append(System.lineSeparator())
                                .toString()
                )
        );
    }
}
