package ru.job4j.strategy;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

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
                        new StringJoiner(System.lineSeparator())
                                .add("     ^     ")
                                .add("    ^ ^    ")
                                .add("   ^   ^   ")
                                .add("  ^     ^  ")
                                .add(" ^       ^ ")
                                .add("^^^^^^^^^^^")
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
                        new StringJoiner(System.lineSeparator())
                                .add("XXXXXXXXX")
                                .add("X       X")
                                .add("X       X")
                                .add("XXXXXXXXX")
                                .toString()
                )
        );
    }
}
