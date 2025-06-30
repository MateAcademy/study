package com.klunniy.sodix;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.print( existsByStringStatusValue("activated"));
    }

    private static boolean existsByStringStatusValue(final String value) {
        return Arrays.stream(RecordStatusEnum.values())
            .anyMatch(e -> e.getTextValue().equalsIgnoreCase(value));
    }
}

 enum RecordStatusEnum {
    ACTIVATED("activated"),
    DEACTIVATED("deactivated"),
    UNCHECKED("unchecked"),
    UNAVAILABLE("unavailable"),
    REJECTED("rejected"),
    DELETED("deleted");

    private final String textValue;

    RecordStatusEnum(String textValue) {
        this.textValue = textValue;
    }

    public String getTextValue() {
        return textValue;
    }

}
