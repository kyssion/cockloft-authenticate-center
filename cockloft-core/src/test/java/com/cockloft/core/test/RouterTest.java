package com.cockloft.core.test;



public class RouterTest {
    public static void main(String[] args) {
        Supper base = new Supper();
        base.setIsup(false);
        base.setNumber(123);
        Test test = new Test();
        test.setSupper(base);
        TestTTT testTTT = new TestTTT();
        testTTT.setTest(test);
    }
}

class Base {
    private Number number;
    private boolean isup;

    public boolean isIsup() {
        return isup;
    }

    public void setIsup(boolean isup) {
        this.isup = isup;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }
}

class Supper extends Base {
    public Integer getNumber() {
        return (Integer) super.getNumber();
    }
}

class Test {
    private Supper supper;

    public Supper getSupper() {
        return supper;
    }

    public void setSupper(Supper supper) {
        this.supper = supper;
    }
}

class TestTTT {
    private Test test;

    private String hhh;

    public String getHhh() {
        return hhh;
    }

    public void setHhh(String hhh) {
        this.hhh = hhh;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}