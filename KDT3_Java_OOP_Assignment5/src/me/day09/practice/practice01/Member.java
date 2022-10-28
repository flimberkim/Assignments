package me.day09.practice.practice01;

public class Member {

    protected String serialNo;
    protected String memberID;
    protected String memberPassword;
    protected String memberPhoneNumber;
    protected String memberEmail;
    protected String memberBirthDate;

    public Member() {
    }

    public Member(String serialNo, String memberID, String memberPassword, String memberPhoneNumber, String memberEmail, String memberBirthDate) {
        this.serialNo = serialNo;
        this.memberID = memberID;
        this.memberPassword = memberPassword;
        this.memberPhoneNumber = memberPhoneNumber;
        this.memberEmail = memberEmail;
        this.memberBirthDate = memberBirthDate;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberPhoneNumber() {
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber(String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberBirthDate() {
        return memberBirthDate;
    }

    public void setMemberBirthDate(String memberBirthDate) {
        this.memberBirthDate = memberBirthDate;
    }

    public void showMemberInfo() {
        System.out.println("회원 일련번호: " + serialNo);
        System.out.println("회원 아이디: " + memberID);
        System.out.println("회원 핸드폰 번호: " + memberPhoneNumber);
        System.out.println("회원 이메일: " + memberEmail);
        System.out.println("회원 생년월일: " + memberBirthDate);
    }

////////////////////////// practice 4 ///////////////////////////////////////////////////

    public String getNewPhoneNumber(String[] candidates) {
        String current = this.memberPhoneNumber;

        for (int i = 0; i < candidates.length; i++) {

            String temp = candidates[i];
            int count = 0;

            for (int j = 4; j < candidates[i].length() - 1; j++) {
                String a = current.substring(j, j + 2);
                String b = candidates[i].substring(j, j + 2);

                if (a.equals(b)) count++;
            }
            //최우선 조건 (연속된 번호 두개만 다를 경우)
            if (count == 1) return temp;

            //두번째 우선 조건
            if (current.substring(4, 8).equals(temp.substring(4, 8))) return temp;

            //세번째 우선 조건
            if (current.substring(9, 13).equals(temp.substring(9, 13))) return temp;

            //네번째 조건
            count = 0;
            for (int k = 0; k < candidates.length; k++) {
                if (current.charAt(k) != temp.charAt(k)) count++;
            }
            if (count == 3) return temp;
        }
        System.out.println("조건에 맞는 번호가 없습니다. 번호를 바꾸지 않습니다.");
        return null;
    }
}