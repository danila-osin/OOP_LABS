import java.util.*;

class Module1 {
  public static double remainder(double a, double b) {
    return a % b;
  }

  public static double triArea(double a, double h) {
    return (a / 2) * h;
  }

  public static int animals(int chicken, int cows, int pigs) {
    return chicken * 2 + cows * 4 + pigs * 4;
  }

  public static boolean profitableGamble(double prob, double prize, double pay) {
    return prob * prize > pay;
  }

  public static String operation(int N, int a, int b) {
    if (a + b == N) {
      return "added";
    } else if (a - b == N) {
      return "subtracted";
    } else if (a * b == N) {
      return "multiplied";
    } else if (a / b == N) {
      return "divided";
    } else {
      return "none";
    }
  }

  public static int ctoa(char c) {
    return c;
  }

  public static int addUpTo(int a) {
    if (a == 1) {
      return 1;
    } else {
      return a + addUpTo(a - 1);
    }
  }

  public static int nextEdge(int a, int b) {
    return a + b - 1;
  }

  public static double sumOfCubes(double[] arr) {
    double sum = 0;

    for (double v : arr) {
      sum += v * v * v;
    }

    return sum;
  }

  public static boolean abcmath(double a, double b, double c) {
    for (int i = 0; i < b; i++) {
      a += a;
    }

    return a % c == 0;
  }
}

class Module2 {
  public static String repeat(String str, int count) {
    StringBuilder result = new StringBuilder();
    int length = str.length();

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < count; j++) {
        result.append(str.charAt(i));
      }
    }

    return result.toString();
  }

  public static int differenceMaxMin(int[] arr) {
    double min = Double.POSITIVE_INFINITY;
    double max = Double.NEGATIVE_INFINITY;

    for (int i : arr) {
      if (i < min) {
        min = i;
      } else if (i > max) {
        max = i;
      }
    }

    return (int) (max - min);
  }

  public static boolean isAvgWhole(int[] arr) {
    double sum = 0;

    for (int i : arr) {
      sum += i;
    }

    double average = sum / arr.length;

    return Math.round(average) % (average) == 0;
  }

  public static int[] cumulativeSum(int[] arr) {
    int[] result = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      result[i] = 0;

      for (int j = 0; j <= i; j++) {
        result[i] += arr[j];
      }
    }

    return result;
  }

  public static int getDecimalPlaces(String str) {
    String decimal = str.split("\\.")[1];
    return decimal.length();
  }

  public static int Fibonacci(int i) {
    int idx = i - 1;
    int[] fibonacci = new int[i];

    for (int j = 0; j <= idx; j++) {
      if (j == 0 || j == 1) {
        fibonacci[j] = j + 1;
        continue;
      }

      fibonacci[j] = fibonacci[j - 1] + fibonacci[j - 2];
    }
    return fibonacci[idx];
  }

  public static boolean isValid(String str) {
    return (str.length() == 5) && str.matches("\\d+");
  }

  public static boolean isStrangePair(String str1, String str2) {
    if (str1.equals("") && str2.equals("")) return true;

    return str1.charAt(0) == str2.charAt(str2.length() - 1) && str1.charAt(str1.length() - 1) == str2.charAt(0);
  }

  public static boolean isPrefix(String word, String prefix) {
    return word.startsWith(prefix.substring(0, prefix.length() - 2));
  }

  public static boolean isSuffix(String word, String suffix) {
    return word.endsWith(suffix.substring(1));
  }

  public static int boxSeq(int n) {
    int result = 0;

    if (n == 0) {
      return result;
    }

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        result -= 1;
      } else {
        result += 3;
      }
    }

    return result;
  }
}

class Module3 {
  public static int solutions(double a, double b, double c) {
    double discriminant = Math.pow(b, 2) - 4 * a * c;

    if (discriminant > 0) {
      return 2;
    } else if (discriminant == 0) {
      return 1;
    } else {
      return 0;
    }
  }

  public static int findZip(String str) {
    if (str.indexOf("zip") == -1) {
      return -1;
    }

    return str.replaceFirst("zip", "").indexOf("zip");
  }

  public static boolean checkPerfect(int num) {
    ArrayList<Integer> dividers = new ArrayList<>();

    for (int i = 1; i < num; i++) {
      if (num / i == 0) dividers.add(i);
    }

    int sum = 0;

    for (double divider: dividers) {
      sum += divider;
    }

    return num == sum;
  }

  public static String flipEndChars(String str) {
    int length = str.length();

    if (length < 2) {
      return "Incompatible.";
    }

    if (str.charAt(0) == str.charAt(length - 1)) {
      return "Two's a pair.";
    }

    return str.charAt(length - 1) + str.substring(1, length - 2) + str.charAt(0);
  }

  public static boolean isValidHexCode(String str) {
    return str.matches("^#[0-9a-fA-f]+${7}");
  }

  public static boolean same(int[] arr1, int[] arr2) {
    int firstCount = 0;
    int secondCount = 0;

    for (int i = 0; i < arr1.length; i++) {
      boolean unique = true;

      for (int j = 0; j < i; j++) {
        if (arr1[i] == arr1[j]) {
          unique = false;
          break;
        }
      }

      if (unique) firstCount++;
    }

    for (int i = 0; i < arr2.length; i++) {
      boolean unique = true;

      for (int j = 0; j < i; j++) {
        if (arr2[i] == arr2[j]) {
          unique = false;
          break;
        }
      }

      if (unique) secondCount++;
    }

    return firstCount == secondCount;
  }

  public static boolean isKaprekar(int num) {
    String square = Integer.toString((int) Math.pow(num, 2));
    int length = square.length();

    if (length == 1) {
      return Integer.parseInt(square) == num;
    }

    if (length == 2) {
      return (int) square.charAt(0) + (int) square.charAt(1) == num;
    }

    int lastPart = Integer.parseInt(square.substring(Math.round((length - 1) / 2), length));
    int firstPart = Integer.parseInt(square.substring(0, Math.round((length - 1) / 2)));

    return firstPart + lastPart == num;
  }

  public static String longestZero(String str) {
    String[] zeros = str.split("1+");
    double max = Double.NEGATIVE_INFINITY;
    int idx = 0;

    for (int i = 0; i < zeros.length; i++) {
      int length = zeros[i].length();

      if (length > max) {
        max = length;
        idx = i;
      }
    }

    return zeros[idx];
  }

  public static int nextPrime(int num) {
    boolean isArgumentPrime = true;

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        isArgumentPrime = false;
        break;
      }
    }

    if (isArgumentPrime) return num;

    int result = 0;

    for (int i = num + 1; i < Double.POSITIVE_INFINITY; i++) {
      boolean isPrime = true;

      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        result = i;
        break;
      }
    }

    return result;
  }

  public static boolean rightTriangle(int a, int b, int c) {
    return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
  }
}

class Module4 {
  public static String bessy(int n, int k, String str) {
    String[] text = str.split(" ");
    String txt="";
    String finaltxt="";
    for (int i = 0; i < n; i++) {
      if (txt.length() + text[i].length() > k) {
        finaltxt = finaltxt.trim() + "\r\n" + text[i] + " ";
        txt = text[i];
      } else {
        finaltxt += text[i] + " ";
        txt += text[i];
      }
    }
    return finaltxt.trim();
  }

  public static String[] split(String str) {
    List<String> list = new ArrayList<String>();
    int f = 0;
    int i = 0;
    while (str.length() > 0) {
      if (str.charAt(i) == '(') f++;
      else f--;
      if (f == 0) {
        list.add(str.substring(0, i + 1));
        str = str.substring(i + 1);
        i = 0;
        continue;
      }
      i++;
    }
    return list.toArray(new String[list.size()]);
  }

  public static String toCamelCase(String str) {
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == '_')
        str = str.substring(0, i) + str.substring(i + 1, i + 2).toUpperCase() + str.substring(i + 2, str.length());
    }
    return str;
  }

  public static String toSnakeCase(String str) {
    return str.replaceAll("([A-Z])", "_$0").toLowerCase();
  }

  public static String overTime(double[] work) {
    double sum = 0;
    if (17 - work[0] >= 0)
      sum += (17 - work[0]) * work[2];
    if (work[1] - 17 >= 0)
      sum += (work[1] - 17) * work[2] * work[3];
    return ('$' + String.valueOf(sum));
  }

  public static String BMI(String weight, String height) {
    double ves = Double.parseDouble(weight.split(" ")[0]);
    double rost = Double.parseDouble(height.split(" ")[0]);
    String out = " ";
    if (weight.contains("pounds"))
      ves = ves * 0.45;
    if (height.contains("inches"))
      rost *= 0.0254;
    double BMI = Math.round((ves / (rost * rost)) * 10.0) / 10.0;
    if (BMI < 18.5)
      out = BMI + " Underweight";
    if (BMI >= 18.5 && BMI <= 24.9)
      out = BMI + " Normal weight";
    if (BMI > 25)
      out = BMI + " Overweight";
    return out;
  }

  public static int bugger(int num) {
    int count = 0;
    while (num > 9) {
      int chnum = 1;
      while (num > 0) {
        chnum *= num % 10;
        num /= 10;
      }
      num = chnum;
      count++;
    }
    return count;
  }

  public static String toStarShorthand(String str) {
    int count = 1;
    char let = str.charAt(0);
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != let) {
        if (count != 1)
          newStr += let + "*" + count;
        else
          newStr += let;
        let = str.charAt(i);
        count = 1;
      } else
        count++;
    }
    if (count != 1)
      newStr += let + "*" + count;
    else
      newStr += let;
    return newStr;
  }

  public static boolean doesRhyme(String str1, String str2) {
    str1 = str1.substring(str1.lastIndexOf(" ") + 1);
    str2 = str2.substring(str2.lastIndexOf(" ") + 1);
    String let = "aeiouyAEIOUY";
    String res1 = "", res2 = "";
    for (int i = 0; i < str1.length(); i++) {
      if (let.indexOf(str1.charAt(i)) != -1)
        res1 += str1.charAt(i);
    }
    for (int i = 0; i < str2.length(); i++) {
      if (let.indexOf(str2.charAt(i)) != -1)
        res2 += str2.charAt(i);
    }
    if (res1.toLowerCase().equals(res2.toLowerCase())) return true;
    else
      return false;
  }

  public static boolean trouble ( long a, long b){
    String aa = Long.toString(a);
    String bb = Long.toString(b);
    int num = 0;
    for (int i = 2 ; i < aa.length(); i++) {
      if (aa.charAt(i) == aa.charAt(i -1) && aa.charAt(i) == aa.charAt(i -2))
        num = aa.charAt(i);
    }
    for (int i = 0 ; i < bb.length(); i++){
      if (bb.charAt(i)==num && bb.charAt(i+1) == num)
        return true;
    }
    return false;
  }

  public static int countUniqueBooks(String str, char c){
    Map<Character, Integer> values = new HashMap<>();
    boolean start = true;
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == c && start) {
        i++;
        while (str.charAt(i) != c){
          Integer n = values.get(str.charAt(i));
          if (n == null)
            values.put(str.charAt(i), 1);
          else
            values.put(str.charAt(i), ++n);
          i++;
        }
        start = false;
      }
      if (str.charAt(i) == c)
        start = true;
    }
    return values.size();
  }
}

class Tasks {
  public static void log(String str) {
    System.out.println(str);
  }

  public static void log(double str) {
    System.out.println(str);
  }

  public static void log(boolean str) {
    System.out.println(str);
  }

  public static void log(int[] arr) {
    for (int i : arr) {
      System.out.println(i);
    }
  }

  public static void log(String[] str) {
    System.out.println(String.join(" ", str));
  }

  public static void main(String[] args) {
    log("Module 1");
    log("===================================");
    log(Module1.remainder(3, 5));
    log(Module1.triArea(5, 4));
    log(Module1.animals(3, 5, 2));
    log(Module1.profitableGamble(0.8, 3, 10));
    log(Module1.operation(25, 13, 12));
    log(Module1.ctoa('A'));
    log(Module1.addUpTo(10));
    log(Module1.nextEdge(13, 25));
    log(Module1.sumOfCubes(new double[]{10, 20, 30}));
    log(Module1.abcmath(10, 3, 15));
    log("Module 2");
    log("===================================");
    log(Module2.repeat("apple", 4));
    log(Module2.differenceMaxMin(new int[]{10, 5, 4, 30, -1}));
    log(Module2.isAvgWhole(new int[]{3, 5, 10, 14, 8}));
    log(Module2.cumulativeSum(new int[]{3, 4, 1, 5, 7, 8}));
    log(Module2.getDecimalPlaces("3.5477"));
    log(Module2.Fibonacci(7));
    log(Module2.isValid("32454"));
    log(Module2.isStrangePair("", ""));
    log(Module2.isPrefix("automation", "auto-"));
    log(Module2.isSuffix("arachnophobia", "-phobia"));
    log(Module2.boxSeq(4));
    log("Module 3");
    log("===================================");
    log(Module3.solutions(1, 0, -1));
    log(Module3.findZip("all zip files are zipped"));
    log(Module3.checkPerfect(6));
    log(Module3.flipEndChars("Cat, dog, and mouse."));
    log(Module3.isValidHexCode("#cde3f5"));
    log(Module3.same(new int[]{1, 3, 4, 4, 4}, new int[]{2, 5, 7}));
    log(Module3.isKaprekar(5));
    log(Module3.longestZero("000000111110000111111000"));
    log(Module3.nextPrime(12));
    log(Module3.rightTriangle(3, 4, 5));
    log("Module 4");
    log("===================================");
    log(Module4.bessy(10, 7, "hello my name is Bessie and this is my essay"));
    log(Module4.split("()()()"));
    log(Module4.toCamelCase("hello_edabit"));
    log(Module4.overTime(new double[]{9, 17, 30, 1.5}));
    log(Module4.BMI("205 pounds", "73 inches"));
    log(Module4.bugger(39));
    log(Module4.toStarShorthand("abbccc"));
    log(Module4.doesRhyme("Sam I am!", "Green eggs and ham."));
    log(Module4.trouble(451997277, 411777228));
    log(Module4.countUniqueBooks("AZYWABBCATTTA", 'A'));
  }
}
