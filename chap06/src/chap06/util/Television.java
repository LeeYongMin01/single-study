package chap06.util;

// 정적 초기화 블록

public class Television {

  static String company = "Samsung";
  static String model = "LCD";
  public static String info;

  static {
    info = company + "-" + model;

  }
}
