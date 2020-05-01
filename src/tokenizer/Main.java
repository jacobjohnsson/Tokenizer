package tokenizer;

import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args) {
    String s = "25*(31d12+100)-40/2";
    System.out.println("Input: " + s);
    Tokenizer tok = new Tokenizer(s);
    StringBuilder sb = new StringBuilder();
    while (tok.hasMoreElements()) {
      sb.append(tok.nextElement() + ",");
    }
    sb.deleteCharAt(sb.length()-1);
    System.out.println(sb.toString());
  }
}
