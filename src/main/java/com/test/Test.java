package com.test;

import com.dslplatform.json.DslJson;
import com.dslplatform.json.runtime.Settings;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.ZonedDateTime;

public class Test {
    private static final DslJson<Object> json = new DslJson<>(Settings.basicSetup());
    public static void main(String[] args) throws IOException {
        byte[] bytes;
        try(ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            json.serialize(Event.New("test", "test", "test".getBytes(StandardCharsets.UTF_8), ZonedDateTime.now()), outputStream);
            bytes = outputStream.toByteArray();
        }
        Event event = json.deserialize(Event.class, new ByteArrayInputStream(bytes));
        System.out.println(event);
    }
}
