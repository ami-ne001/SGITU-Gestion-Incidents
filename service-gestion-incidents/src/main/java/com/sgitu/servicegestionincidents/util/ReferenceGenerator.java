package com.sgitu.servicegestionincidents.util;

import java.time.Year;
import java.util.UUID;

public class ReferenceGenerator {

    public static String generate() {
        String year = String.valueOf(Year.now().getValue());
        String uuid = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        return "INC-" + year + "-" + uuid;
    }
}
