public class Member {

    final String memberName;
    final int memberId;

    public Member(String memberName, int memberId){
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public String toString() {
        return "Name: " + memberName + " (Borrow number: " + memberId + ")";
    }

    public int getId() {
        return memberId;
    }

}
