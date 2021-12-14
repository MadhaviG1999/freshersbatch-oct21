public class Lowercase {
    
        public static void main(String[] args) {
          String txt = "Java String pool refers to collection of strings which are stored in heap memory";
          System.out.println(txt.toUpperCase());
          System.out.println(txt.toLowerCase());
          System.out.println(txt.replace('a', '$'));
          System.out.println(txt.contains("collection"));
          System.out.println(txt.matches("java string pool refers to collection of strings which are stored in heap memory"));
          System.out.println(txt.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
        }
      }
    

