package com.mycompany.enumexample1;

enum Response {
    BAD, GOOD, EXCELLENT, VERYGOOD(10);
    int value;

    Response(int val) {
        value = val;
    }

    Response() {
    }

    int getVaue() {
        return value;
    }
}

class Enumexample1 {

    public static void main(String[] args) {
        Response res = Response.BAD;
        System.out.println(res); //this will print BAD
        System.out.println(res.value); //this will print the value of BAD, ie 0. direct

        System.out.println(res.getVaue()); //through method
        res.value = 500; //changing the value of res. now it also change the value of BAD

// becuase betho res and BAD are pointing to same memory location
        System.out.println(res.value + " " + Response.BAD.value); //both will be 500
    }
}
