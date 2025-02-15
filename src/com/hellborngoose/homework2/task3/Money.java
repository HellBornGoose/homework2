package com.hellborngoose.homework2.task3;

public class Money {
    private Integer dollar, cent;
    public Money() {
        this.dollar = 0;
        this.cent = 0;
    }
    public Money(Integer dollar, Integer cent) {
        if (cent >= 100) {
            this.dollar = dollar + cent / 100;
            this.cent = cent % 100;
        } else {
            this.dollar = dollar;
            this.cent = cent;
        }
    }
    public void display() {
        System.out.printf("%d.%02d\n", dollar, cent);
    }
    public void setWholePart(Integer dollar) {
        this.dollar = dollar;
    }

    public void setCents(Integer cent) {
        if (cent >= 100) {
            this.dollar += cent / 100;
            this.cent = cent % 100;
        } else {
            this.cent = cent;
        }
    }
    public Integer getWholePart() {
        return dollar;
    }

    public Integer getCents() {
        return cent;
    }
}
