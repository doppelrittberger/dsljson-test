package com.test;

import com.dslplatform.json.CompiledJson;

@CompiledJson
public class JsonInit {
    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
