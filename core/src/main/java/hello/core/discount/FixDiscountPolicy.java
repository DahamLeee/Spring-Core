package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAccount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) { // enum 은 == 쓰는게 맞다
            return discountFixAccount;
        } else{
            return 0;
        }
    }
}
