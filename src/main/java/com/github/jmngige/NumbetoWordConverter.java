package com.github.jmngige;

public class NumbetoWordConverter {

    private String[] ones = new String[]{
            " One",
            " Two",
            " Three",
            " Four",
            " Five",
            " Six",
            " Seven",
            " Eight",
            " Nine",
            " Ten",
            " Eleven",
            " Twelve",
            " Thirteen",
            " Fourteen",
            " Fifteen",
            " Sixteen",
            " Seventeen",
            " Eighteen",
            " Nineteen"};

    private String[] tens = new String[]{" Twenty",
            " Thirty",
            " Forty",
            " Fifty",
            " Sixty",
            " Seventy",
            " Eighty",
            " Ninety"};

    private String[] groups = new String[]{"",
            " Thousand",
            " Million",
            " Billion",
            " Trillion",
            " Quadrillion",
            " Quintillion"};

    private String string = new String();

    public String getString() {
        return this.string;
    }
    public String EnglishNumber(long enteredNo) {
        String amtInWords = null;
        for (int i = this.groups.length - 1; i >= 0; i--) {
            long cutoff = (long) Math.pow(10.0D, (i * 3));
            if (enteredNo >= cutoff) {
                int thisPart = (int) (enteredNo / cutoff);
                if (thisPart >= 100) {
                    amtInWords = String.valueOf(amtInWords) + this.ones[thisPart / 100 - 1] + " Hundred";
                    thisPart %= 100;
                }
                if (thisPart >= 20) {
                    amtInWords = String.valueOf(amtInWords) + this.tens[thisPart / 10 - 2];
                    thisPart %= 10;
                }
                if (thisPart >= 1) {
                    amtInWords = String.valueOf(amtInWords) + this.ones[thisPart - 1];
                }
                amtInWords = String.valueOf(amtInWords) + this.groups[i];
                enteredNo %= cutoff;
            }
        }
        if (amtInWords.length() == 0) {
            amtInWords = "Zero";
        } else {
            amtInWords = amtInWords.substring(4);
        }
        return amtInWords;
    }
}
