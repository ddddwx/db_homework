package org.scu.db.demo.model;

import java.sql.Date;

public class Book {
    private Integer bookId;
    private String edition;
    private Date borrowduedate;
    private Integer borrowermemno;
    private String callnumber;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public Date getBorrowduedate() {
        return borrowduedate;
    }

    public void setBorrowduedate(Date borrowduedate) {
        this.borrowduedate = borrowduedate;
    }

    public Integer getBorrowermemno() {
        return borrowermemno;
    }

    public void setBorrowermemno(Integer borrowermemno) {
        this.borrowermemno = borrowermemno;
    }

    public String getCallnumber() {
        return callnumber;
    }

    public void setCallnumber(String callnumber) {
        this.callnumber = callnumber;
    }

}