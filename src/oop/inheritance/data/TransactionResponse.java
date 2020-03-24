package oop.inheritance.data;

public class TransactionResponse {
    private boolean approved;
    private String hostReference;

    public TransactionResponse(boolean approved, String hostReference) {
        this.approved = approved;
        this.hostReference = hostReference;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public String getHostReference() {
        return hostReference;
    }

    public void setHostReference(String hostReference) {
        this.hostReference = hostReference;
    }
}
