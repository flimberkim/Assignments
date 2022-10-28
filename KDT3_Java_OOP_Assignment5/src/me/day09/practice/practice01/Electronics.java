package me.day09.practice.practice01;

import me.day09.practice.practice01.Electronic;

import java.sql.Array;
import java.util.ArrayList;

public class Electronics {
    Electronic[] electronics = new Electronic[10];

    public Electronics(Electronic[] electronics){
        this.electronics = electronics;
    }

//////////////////////practice 2번////////////////////////////

    public Electronic findByProductNo(String productNo){
        for(int i = 0; i < electronics.length; i++) {
            if (electronics[i].getProductNo() == productNo) {
                return electronics[i];
            }
        }
        return null;
    }

/////////////////////practice 3번////////////////////////////

    public Electronic[] groupByCompanyName(companyName companies){

        ArrayList<Electronic> arr = new ArrayList<>();

        for(int i = 0; i < electronics.length; i++)
        {
            if(electronics[i].getCompanies() == companies) arr.add(electronics[i]);
        }

        return arr.toArray(new Electronic[0]);
    }
}
