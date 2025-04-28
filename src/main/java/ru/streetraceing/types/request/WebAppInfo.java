package ru.streetraceing.types.request;

import ru.streetraceing.types.request.base.Container;

public class WebAppInfo extends Container {
    public WebAppInfo(String url) {
        add("url", url);
    }
}
