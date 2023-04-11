package ua.en.kosse.oksana.hillel.Even;

public class EvenNumber {

    public boolean evenNumberBoolean(int valA) {
        return valA >= 0;
    }

    public String evenNumberString(int valB) {
        return valB >= 0 ? "додатне число" : "від'ємне число";
    }

}
