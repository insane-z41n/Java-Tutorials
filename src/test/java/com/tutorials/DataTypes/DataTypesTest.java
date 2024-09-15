package com.tutorials.DataTypes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DataTypesTest {

    @Test
    public void wideningCastIntToDouble_shouldReturn_typeIntWithValue() {
        DataTypes dataTypes = new DataTypes();
        double y  = dataTypes.wideningCastIntToDouble(5);

        assertEquals(5.0, y);
    }
    
    @Test
    public void narrowingCastDoubleToInt_shouldReturn_typeIntWithValue() {
        DataTypes dataTypes = new DataTypes();
        int x  = dataTypes.narrowingCastDoubleToInt(5.0);
        
        assertEquals(5, x);
    }
}
