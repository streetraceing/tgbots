package ru.streetraceing.types.response.base;

import java.util.List;

public class answerInlineQuery {
    public String inline_query_id;
    public List<InlineQueryResult> results;
    public Integer cache_time;
    public boolean is_personal;
    public String next_offset;
    public InlineQueryResultsButton button;
}
