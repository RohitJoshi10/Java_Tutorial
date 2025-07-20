package Java8Features.LambdaExpression_And_Functional_Interface;

public class AnonymousInterfaceImplEmployee implements AnonymousInterfaceEmployee{
    @Override
    public String getSalary(){
        return "50LPA";
    }

    @Override
    public String getDesignation(){
        return "SSE";
    }
}
