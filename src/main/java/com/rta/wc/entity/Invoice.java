package com.rta.wc.entity;

import java.util.Date;

public class Invoice {

    private Long invoiceId;
    private String invoiceName;
    private Date invoiceStartDate;
    private Date invoiceDueDate;
    private Double invoiceAmount;
    private Boolean invoiceOverDue;
    private Boolean invoicePaid;
    private Customer customer;

    public Invoice(){}

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public Date getInvoiceStartDate() {
        return invoiceStartDate;
    }

    public void setInvoiceStartDate(Date invoiceStartDate) {
        this.invoiceStartDate = invoiceStartDate;
    }

    public Date getInvoiceDueDate() {
        return invoiceDueDate;
    }

    public void setInvoiceDueDate(Date invoiceDueDate) {
        this.invoiceDueDate = invoiceDueDate;
    }

    public Double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public Boolean getInvoiceOverDue() {
        return invoiceOverDue;
    }

    public void setInvoiceOverDue(Boolean invoiceOverDue) {
        this.invoiceOverDue = invoiceOverDue;
    }

    public Boolean getInvoicePaid() {
        return invoicePaid;
    }

    public void setInvoicePaid(Boolean invoicePaid) {
        this.invoicePaid = invoicePaid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceName='" + invoiceName + '\'' +
                ", invoiceStartDate=" + invoiceStartDate +
                ", invoiceDueDate=" + invoiceDueDate +
                ", invoiceAmount=" + invoiceAmount +
                ", invoiceOverDue=" + invoiceOverDue +
                ", invoicePaid=" + invoicePaid +
                ", customer=" + customer +
                '}';
    }
}
