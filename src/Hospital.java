/*
Q . Briefly explain the concept of constructor overloading.
ANSWER -> Constructor overloading is the process of creating multiple constructors
in the class consisting of the same name with a difference in the constructor parameters.
Depending upon the number of parameters and their corresponding types, distinguishing
 of the different types of constructors is done by the compiler.

 */
public class Hospital {
    int variable1, variable2;
    double variable3;

    public Hospital(int doctors, int nurses) {
        variable1 = doctors;
        variable2 = nurses;
    }

    public Hospital(int doctors) {
        variable1 = doctors;
    }

    public Hospital(double salaries) {
        variable3 = salaries;
    }

    public static void main(String[] args) {
        Hospital h = new Hospital(2,5);
//Three constructors are defined here but they differ on the basis of parameter
// type and their numbers
    }
}
