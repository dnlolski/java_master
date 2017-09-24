package com.OopInheritance;


public class OOP_3 {
    public static void main(String[] args) {

        VipCustomer vipAcc = new VipCustomer();
        System.out.println(vipAcc.getName());
        System.out.println(vipAcc.getEmail());

        VipCustomer vipAcc1 = new VipCustomer("Daniel",1000);
        System.out.println(vipAcc1.getName());
        System.out.println(vipAcc1.getEmail());

        VipCustomer vipAcc2 = new VipCustomer("Robert", 200,"robert@robert.com");
        System.out.println(vipAcc2.getName());
        System.out.println(vipAcc2.getEmail());

    }
}
