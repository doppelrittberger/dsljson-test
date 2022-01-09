package com.test;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.time.ZonedDateTime;

public class Event {
    private final String id;
    private final String name;
    private final byte[] payload;
    private final ZonedDateTime created;

    private Event(String id, String name, byte[] payload, ZonedDateTime created) {
        this.id = id;
        this.name = name;
        this.payload = payload;
        this.created = created;
    }

    @JsonCreator
    public static Event New(String id, String name, byte[] payload, ZonedDateTime created) {
        return new Event(id, name, payload, created);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte[] getPayload() {
        return payload;
    }

    public ZonedDateTime getCreated() {
        return created;
    }
}
