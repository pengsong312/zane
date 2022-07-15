package com.zane.basis;

import org.junit.Assert;
import org.junit.Test;

public class BasisEnumTest {

    @Test
    public void parseBasisByCode() {
        BasisEnum basisEnum = BasisEnum.parseBasisByCode(100);

        Assert.assertTrue(basisEnum == BasisEnum.C);

        basisEnum = BasisEnum.parseBasisByCode(10);
        Assert.assertTrue(basisEnum == BasisEnum.B);
    }
}