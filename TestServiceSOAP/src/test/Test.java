package test;


import packageClient.ExampleService;

public class Test {
    public static void main(String[] args) {
        ExampleService exampleService = new ExampleService();
        System.out.println(exampleService.getExamplePort().somme(14, 15) );
    }

}
