public class EasyLogs {

  public static double logs(double x, double a, double b) {
    
        double product = a * b;
        return Math.log(product) / Math.log(x);

  }

}

/* Other solutions

public class EasyLogs {

  public static double logs(double x, double a, double b) {
    return (Math.log(a) + Math.log(b)) / Math.log(x);
  }

}

public class EasyLogs {

  public static double logs(double x, double a, double b) {
    return Math.log(a*b)/Math.log(x);
  }

}

public class EasyLogs {

  public static double logs(double x, double a, double b) {
        return (double) (Math.log(a) / Math.log(x)) + (Math.log(b) / Math.log(x));
  }

}


import static java.lang.Math.log;

public class EasyLogs {

  public static double logs(double x, double a, double b) {
      return log(a*b) / log(x);
  }

}



*/