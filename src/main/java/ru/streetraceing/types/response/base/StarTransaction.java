package ru.streetraceing.types.response.base;

public class StarTransaction {
    public String id;
    public Integer amount;
    public Integer nanostar_amount;
    public long date;
    public TransactionPartner source;
    public TransactionPartner receiver;
}
