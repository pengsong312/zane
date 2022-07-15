package com.zane.basis;

public enum BasisEnum {
    A(1),
    B(10),
    C(100),
    NULL(1000),
    ;

    private int code;

    BasisEnum(int code) {
        this.code = code;
    }

    public static BasisEnum parseBasisByCode(int code) {
        switch (code) {
            case 1:
            case 2:
            case 3:
                return A;
            // 非顺序执行，default 在前面还会走到case 10 和 100 的流程里
            default:
                return NULL;
            case 10:
                return B;
            case 100:
                return C;
        }
    }
}
