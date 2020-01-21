package com.hunter.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRequestLogView {

    private UUID userId;
    private BigDecimal maxPaymentAmount;
    private Timestamp created;
    private Timestamp updated;

    public UUID getUserId() {
        return userId;
    }

    public BigDecimal getMaxPaymentAmount() {
        return maxPaymentAmount;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "userId " + userId.toString() + " maxPaymentAmountCents " + maxPaymentAmount + " created " + created
                + " updated " + updated;
    }

}
