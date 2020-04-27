package com.rta.wc.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="invoice_id")
    private Long invoiceId;

    @Column(name="invoice_name")
    private String invoiceName;

    @Column(name="invoice_start")
    private Date invoiceStartDate;

    @Column(name="invoice_due")
    private Date invoiceDueDate;

    @Column(name="invoice_amnt")
    private Double invoiceAmount;

    @Column(name="invoice_od")
    private Boolean invoiceOverDue;

    @Column(name="invoice_paid")
    private Boolean invoicePaid;

    @ManyToOne(fetch = FetchType.EAGER ,cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="cust_id")
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
