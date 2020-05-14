import java.util.*;

public class Membership {

    public final int DURATION = 1;

    private int memberID;
    private MembershipType membershipType;
    private int price;
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;

    public Membership(MembershipType membershipType) {
        this.memberID = 0;
        this.membershipType = membershipType;
        if (this.membershipType == membershipType.JUNIOR) {
            setPrice(5);
        } else if (this.membershipType == membershipType.STUDENT) {
            setPrice(10);
        } else if (this.membershipType == membershipType.NORMAL) {
            setPrice(15);
        } else if (this.membershipType == membershipType.SENIOR) {
            setPrice(10);
        }
        this.startDate = new GregorianCalendar();
        this.endDate = new GregorianCalendar();
        this.endDate.add(GregorianCalendar.YEAR, DURATION);
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public GregorianCalendar getStartDate() {
        return startDate;
    }

    public GregorianCalendar getEndDate() {
        return endDate;
    }

    public void setEndDate(GregorianCalendar endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "DURATION=" + DURATION +
                ", memberID=" + memberID +
                ", membershipType=" + membershipType +
                ", price=" + price +
                ", startDate=" + startDate.getTime() +
                ", endDate=" + endDate.getTime() +
                '}';
    }
}

