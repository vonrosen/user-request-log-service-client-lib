package com.hunter.model;

import java.math.BigInteger;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRequestLogView {

    private UUID userId;
    private BigInteger maxPaymentAmountCents;
    public UUID getUserId() {
        return userId;
    }
    public BigInteger getMaxPaymentAmountCents() {
        return maxPaymentAmountCents;
    }

}
