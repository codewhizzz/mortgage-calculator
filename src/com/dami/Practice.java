package com.dami;

public class Practice {
    public static void main (String[] args) {
        boolean hasGoodCredit = true;
        boolean hasHighIncome = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasGoodCredit || hasHighIncome) && hasCriminalRecord ;
    }
}
