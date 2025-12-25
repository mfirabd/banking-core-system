package com.example.banking.batch;
import java.time.LocalTime;

public class CutOffTimePolicy {
    private static final LocalTime CUT_OFF = LocalTime.of(17, 0); // 5:00 PM

    public boolean isAfterCutOff() {
        return LocalTime.now().isAfter(CUT_OFF);
    }
}