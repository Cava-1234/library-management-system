public class Member {

    record Member1(String memberName, int memberId){}
    Member1 member1 = new Member1("Richard Hendricks", 111);
    Member1 member2 = new Member1("Gavin Belson", 222);
    Member1 member3 = new Member1("Donald Dunn aka Jared", 333);
    Member1 member4 = new Member1("Dinesh Chugtai", 444);
    Member1 member5 = new Member1("Bertram Gilfoyle", 555);



    final String memberName;
    final int memberId;

    public Member(String memberName, int memberId){
        this.memberName = memberName;
        this.memberId = memberId;
    }

@Override
    public String toString() {
        return "Name: " + memberName + " (Borrow number: " + memberId + ")";
    }

    public int getId() {
        return memberId;
    }
}
