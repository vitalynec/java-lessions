package ru.vitalynec.java;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import ru.vitalynec.java.exception.MyArrayDataException;
import ru.vitalynec.java.exception.MyArraySizeException;

public class ApplicationTest {

    @Test(expected = MyArraySizeException.class)
    public void getMatrixSumInvalidLessSizeTest() throws MyArraySizeException, MyArrayDataException {
        String[][] str = {
                {"12", "13", "1324", "234"},
                {"12", "13", "1324", "234"},
                {"12", "13"},
                {"12", "13", "1324", "234"}
        };
        Application.getMatrixSum(str);
    }

    @Test(expected = MyArraySizeException.class)
    public void getMatrixSumInvalidSizeTest() throws MyArraySizeException, MyArrayDataException {
        String[][] str = {
                {"12", "13", "1324", "234"},
                {"12", "13", "1324", "234"},
                {"12", "13", "1324", "234", "11"},
                {"12", "13", "1324", "234"}
        };
        Application.getMatrixSum(str);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void getMatrixSumInvalidDataTest() throws MyArraySizeException, MyArrayDataException {
        String[][] str = {
                {"12", "13", "1324", "234"},
                {"12", "13", "1324", "234"},
                {"1O", "13", "1324", "234"},
                {"12", "13", "1324", "234"}
        };

        exceptionRule.expect(MyArrayDataException.class);
        exceptionRule.expectMessage(MyArrayDataException.DEFAULT_MSG + "[3][1]");

        Application.getMatrixSum(str);
    }
}