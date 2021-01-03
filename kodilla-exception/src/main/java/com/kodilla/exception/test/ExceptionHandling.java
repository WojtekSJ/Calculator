package com.kodilla.exception.test;
public class ExceptionHandling {

  SecondChallenge hello = new SecondChallenge();
  double side;
  public String useSecondChallange(double number1, double number2) throws Exception{
      throw new Exception();
  }

    public String checkSecondChallange(double number1, double number2) throws Exception{
      try {
          System.out.println(hello.probablyIWillThrowException(number1, number2));
          return hello.probablyIWillThrowException(number1, number2);
      } catch (Exception e) {
          System.out.println("Blad przetwarzania: " + e.getMessage());
          throw new Exception();
      } finally {
          System.out.println("Exception checked.");
      }

    }

}
