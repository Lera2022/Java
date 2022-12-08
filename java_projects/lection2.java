// public class lection2 {
//     public static void main(String[] args) {
//         var s = System.currentTimeMillis();
//         //String str = "";​
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < 1_000_000; i++) {
//             //str += "+";​
//             sb.append("+");
//         }
//         System.out.println(System.currentTimeMillis() - s);
//         //System.out.println(str);​
//         //System.out.println(sb);​
//     }
//  }

// String str = "";​
// for (int i = 0; i < 1_000_000; i++) {​
//     str += "+";​
// }

// StringBuilder sb = new StringBuilder();​
// for (int i = 0; i < 1_000_000; i++) {​
//     sb.append("+");​
// }

// public class program {​
//     public static void main(String[] args) {​
//       String[] name = { "C", "е", "р", "г", "е", "й" };​
//       String sk = "СЕРГЕЙ КА.";​
//       System.out.println(sk.toLowerCase()); // сергей ка.​
//       System.out.println(String.join("", name)); // Cергей​
//       System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));​
//       // C,е,р,г,е,й​
//       System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));​
//      }​
//   }

// File f1 = new File("file.txt");​
// File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

// import java.io.File;​
// public class fileSystemDemo {​
//    public static void main(String[] args) {​
//        String pathProject = System.getProperty("user.dir");​
//        String pathFile = pathProject.concat("/file.txt");​
//        File f3 = new File(pathFile);​
//        System.out.println(f3.getAbsolutePath());​
//        // /Users/sk/vscode/java_projects/file.txt​
//        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt​
//    }​
// }

// try {​
//     Код, в котором может появиться ошибка​
//   } catch (Exception e) {​
//     Обработка, если ошибка случилась​
//   }​
//   finally {​
//     Код, который выполнится в любом случае​
//   }

// import java.io.File;​
// public class tryDemo {​
//    public static void main(String[] args) {​
//        try {​
//            String pathProject = System.getProperty("user.dir");​
//            String pathFile = pathProject.concat("/file.txt");​
//            File f3 = new File(pathFile);​
//            System.out.println("try");​
//        } catch (Exception e) {​
//            System.out.println("catch");​
//        }​
//        finally​
//        { System.out.println("finally"); }​
//    }​
// }

// import java.io.File;​
// public class tryDemo {​
//    public static void main(String[] args) {​
//        try {​
//            String pathProject = System.getProperty("user.dir");​
//            String pathFile = pathProject.concat("/file.txt");​
//            File f3 = new File(pathFile);​
//            System.out.println("try");​
//        } catch (Exception e) {​
//            System.out.println("catch");​
//        }​
//        finally​
//        { System.out.println("finally"); }​
//    }​
// }

// import java.io.File;​
// public class tryDemo {​
//    public static void main(String[] args) {​
//        try {​
//            String pathProject = System.getProperty("user.dir");​
//            String pathFile = pathProject.concat("/file.txt");​
//            File file = new File(pathFile);​
//            if (file.createNewFile()) {​
//                System.out.println("file.created");​
//            }​
//            else {​
//                System.out.println("file.existed");​
//            }​
//        } catch (Exception e) {​
//         System.out.println("catch");​
//        } finally {​
//     System.out.println("finally");​
// }

// String line = "empty";​
// try {​
//    File file = new File(pathFile);​
//    if (file.createNewFile()) {​
//        System.out.println("file.created"); }​
//    else {​
//        BufferedReader bufReader =​
//        new BufferedReader(new FileReader(file));​
//        System.out.println("file.existed");​
//        line = bufReader.readLine();​
//        bufReader.close(); }​
// } catch (Exception e) {​
//    //e.printStackTrace();​
// } finally {​
//    System.out.println(line);​
// }

// import java.io.File;​
// public class Ex0043 {​
//    public static void main(String[] args) {​
//        String pathProject = System.getProperty("user.dir");​
//        String pathDir = pathProject.concat("/files");​
//        File dir = new File(pathDir);​
//        System.out.println(dir.getAbsolutePath());​
//        if (dir.mkdir()) {​
//            System.out.println("+");​
//        } else {​
//            System.out.println("-");​
//        }​
//        for (String fname : dir.list()) {​
//            System.out.println(fname);​
//        } } ​
// }

// Использование​
// Logger logger = Logger.getLogger()​
// ​
// Уровни важности​
// INFO, DEBUG, ERROR, WARNING и др.​
// ​
// Вывод​
// ConsoleHandler info = new ConsoleHandler();​
// log.addHandler(info);​
// ​
// Формат вывода: структурированный, абы как*​
// XMLFormatter, SimpleFormatter

// import java.util.logging.*;​
// public class Ex0043 {​
//    public static void main(String[] args) {​
//        Logger logger = Logger.getLogger(Ex0043.class.getName());​
//        logger.setLevel(Level.INFO);​
//        ConsoleHandler ch = new ConsoleHandler();​
//        logger.addHandler(ch);​
//        SimpleFormatter sFormat = new SimpleFormatter();​
//        ch.setFormatter(sFormat);​
//        logger.log(Level.WARNING, "Тестовое логирование");​
//        logger.info("Тестовое логирование");​
//    }​
// }

// import java.util.logging.*;​
// public class Ex0043 {​
//    public static void main(String[] args) {​
//        Logger logger = Logger.getLogger(Ex0043.class.getName());​
//        logger.setLevel(Level.INFO);​
//        ConsoleHandler ch = new ConsoleHandler();​
//        logger.addHandler(ch);​
//        //SimpleFormatter sFormat = new SimpleFormatter();​
//        XMLFormatter xml = new XMLFormatter();​
//        //ch.setFormatter(sFormat);​
//        ch.setFormatter(xml);​
//        logger.log(Level.WARNING, "Тестовое логирование");​
//        logger.info("Тестовое логирование");​
//    }​
// }