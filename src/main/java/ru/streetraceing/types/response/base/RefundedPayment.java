package ru.streetraceing.types.response.base;

public class RefundedPayment {
    public String currency;
    public Integer total_amount;
    public String invoice_payload;
    public String telegram_payment_charge_id;
    public String provider_payment_charge_id;
}
