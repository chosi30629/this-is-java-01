package _10_basic_api_class.object_class;

public class Member {
    public String id;


    public Member(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member equalsMember = (Member) obj;

            if (id.equals(equalsMember.id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        // String 의 hashCode()는 같은 문자열일 경우 동일한 해시코드를 리턴
        return id.hashCode();
    }

}
