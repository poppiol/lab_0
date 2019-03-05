package edu.iis.mto.lab_0;

import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;

public class TailsTest {

    private static final String THIRD_ELEM_VALUE = "LLO";
    private static final int THIRD_ELEM_INDEX = 2;
    private static final String HELLO = "HELLO";
    private TailsGenerator tailsGenerator;
    private List<String> tails;

    @Before
    public void setup() {
        tailsGenerator = new TailsGenerator();
    }

    @Test
    public void tailsShouldReturnEmptyListIfParameterIsNull() {
        tails = tailsGenerator.tails(null);
        assertThat(tails, empty());
    }

    @Test
    public void tailsShouldReturnListOfStringsOfSizeEqualsToInputStringLengthPlusOne() {

        tails = tailsGenerator.tails(HELLO);
        assertThat(tails, Matchers.hasSize(HELLO.length() + 1));
    }

    @Test
    public void tailsShouldReturnFullStringAsFirstElement() {
        tails = tailsGenerator.tails(HELLO);
        assertThat(tails.get(0), Matchers.equalTo(HELLO));
    }

    @Test
    public void tailsShouldReturnLLOAsThirdString() {
        tails = tailsGenerator.tails(HELLO);
        assertThat(tails.get(THIRD_ELEM_INDEX), Matchers.equalTo(THIRD_ELEM_VALUE));
    }

    @Test
    public void tailsShouldReturnEmptyStringAsLastElement() {
        tails = tailsGenerator.tails(HELLO);
        assertThat(tails.get(tails.size() - 1), Matchers.equalTo(""));
    }

}
