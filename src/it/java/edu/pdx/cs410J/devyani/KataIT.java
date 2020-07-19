package edu.pdx.cs410J.devyani;

import edu.pdx.cs410J.devyani.Diamond;
import org.junit.Assert;
import org.junit.Test;

public class KataIT {
    @Test
    public void for_input_letter_A_return_AA() {
        Assert.assertEquals("A\nA", Diamond.printDiamond('A'));
    }

}