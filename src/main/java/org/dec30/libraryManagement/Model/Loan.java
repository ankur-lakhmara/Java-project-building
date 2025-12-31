package org.dec30.libraryManagement.Model;

import java.time.LocalDate;

public class Loan {
    private int bookId;
    private int memberId;
    private LocalDate issuedAt;

    public Loan(int bookId, int memberId, LocalDate issuedAt) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.issuedAt = issuedAt;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public LocalDate getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(LocalDate issuedAt) {
        this.issuedAt = issuedAt;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString(){
        return "Loan: { bookId=" + bookId + ", memberId=" + memberId + ", issuedAt=" + issuedAt + "}";

    }
}
