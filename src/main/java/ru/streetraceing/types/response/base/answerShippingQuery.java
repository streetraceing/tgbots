package ru.streetraceing.types.response.base;

import java.util.List;

public class answerShippingQuery {
    public String shipping_query_id;
    public boolean ok;
    public List<ShippingOption> shipping_options;
    public String error_message;
}
