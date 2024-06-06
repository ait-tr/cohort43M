package code.lambdaExample;

public class RequestDemo {
    public static void main(String[] args) {
        RequestUtil requestUtil = new RequestUtil();

        Request request1 = new Request("Test Test Test", 100);
        Request request2 = new Request("Test2", 90);
        Request request3 = new Request("Test3", 120);
        Request request4 = new Request("Test4", 201);
        Request request5 = new Request("Test5", 300);
        Request request6 = new Request("Test6", 404);
        Request request7 = new Request("Test7", 550);

        System.out.println(requestUtil.checkRequest(request1));

        System.out.println(requestUtil.checkRequest(request2));

        System.out.println(requestUtil.checkRequest(request3));

        System.out.println(requestUtil.checkRequest(request4));

        System.out.println(requestUtil.checkRequest(request5));

        System.out.println(requestUtil.checkRequest(request6));

        System.out.println(requestUtil.checkRequest(request7));


    }
}
