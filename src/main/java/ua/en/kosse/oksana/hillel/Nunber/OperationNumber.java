package ua.en.kosse.oksana.hillel.Nunber;

public class OperationNumber extends SumSign {

    public String summaSign(int valA, int valB){
        return SumSign.checkSumSign(valA, valB) > 0 ? "\"Сума позитивна\"" : "\"Сума негативна\"";
    }

    public Boolean booleanSign(int valA, int valB){
        int result = SumSign.checkSumSign(valA, valB);
        return  result >= 10 && result <= 20 ;
    }

}
