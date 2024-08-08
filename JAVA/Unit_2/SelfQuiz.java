package Unit_2;

public class SelfQuiz {
    public static void main(String[] args) {
      int i = 0;

      outer:
      
      while (i < 5) {
      
          inner:
      
          for (int j = 0; j < 3; j++) {
      
              if (i == 3)
      
                  break outer;
      
              if (j == 2)
      
                  continue inner;
      
      
          }
      
          i++;
      
      }
    }
}