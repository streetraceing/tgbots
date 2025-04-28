package ru.streetraceing.types.response.base;

import java.util.List;

public class PassportData {
    public List<EncryptedPassportElement> data;
    public EncryptedCredentials credentials;
}
