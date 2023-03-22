package homework.fileUtil;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input folder path: ");
        String folderPath = scanner.nextLine();
        System.out.println("Please input file path: ");
        String filePath = scanner.nextLine();
        System.out.println("Pleas input fail name");
        String fileName = scanner.nextLine();
        System.out.println("Pleas input content");
        String content = scanner.nextLine();
        fileSearch(folderPath, fileName);
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        findLines(filePath, keyword);
        printSizeOfPackage(folderPath);
        createFileWithContent(folderPath, fileName);
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch(String folder, String fileName) {
        File folderFile = new File(folder);
        if (!folderFile.isDirectory()) {
            System.out.println("wrong folder path");
            return;
        }
        File[] listFail = folderFile.listFiles();
        boolean found = false;
        for (File file : listFail) {
            if (file.isFile() && file.getName().contains(fileName)) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch(String folder, String keyword) {
        File folderFile = new File(folder);
        if (!folderFile.isDirectory()) {
            System.out.println("wrong folder path");
            return;
        }
        File[] listFiles = folderFile.listFiles();
        for (File file : listFiles) {
            if (file.isFile() && file.getName().endsWith(".txt"))
//            System.out.println(file);
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                    String line = null;
                    while ((line = bufferedReader.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println(file);
                            break;
                        }
                    }
                } catch (IIOException e) {
                    e.printStackTrace();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines(String filePath, String keyword) {
        File file = new File(filePath);
        if (!file.exists() || file.getName().endsWith(".txt")) {
            System.out.println("Wrong file or file path");
            return;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = null;
            int lineN = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(lineN + " " + line);
                }
                lineN++;
            }
        } catch (IIOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage(String folderPath) {
        File folderFile = new File(folderPath);
        if (!folderFile.isDirectory()) {
            System.out.println("wrong folder path");
            return;
        }
        File[] files = folderFile.listFiles();
        long size = 0;
        for (File file : files) {
            if (file.isFile()) {
                size += file.length();
            }
            System.out.println("size: " + size / 1024 + " KB");
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent(String folderPath, String fileName) {
        File folderFile = new File(folderPath);
        if (!folderFile.isDirectory()) {
            System.out.println("wrong folder path");
            return;
        }
        File file = new File(folderFile, fileName);
        if (file.exists()) {
            System.out.println("file exists");
            return;
        }
        try {
            boolean newFile = file.createNewFile();
            if (newFile) {
                try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
                    int content = 0;
                    fileWriter.write(content);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
