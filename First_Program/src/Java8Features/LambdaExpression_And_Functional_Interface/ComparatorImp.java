package Java8Features.LambdaExpression_And_Functional_Interface;

import java.util.Comparator;

public class ComparatorImp implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b){
        return b-a; // To sort in acse then a-b and to sort in desc then b-a;
    }
}
