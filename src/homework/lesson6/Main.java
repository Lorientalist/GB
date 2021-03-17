package homework.lesson6;

import java.io.*;
import java.util.Scanner;

/**
 * src/homework/lesson6
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        fileConcat();
        System.out.println(wordSeeker("радуга", "src/homework/lesson6/wiki.txt"));
        System.out.println(wordSeekerInDirectory("Андах", "src/homework/lesson6"));
    }

    /**
     * Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
     * Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
     */
    public static void fileConcat() {
        try {
            FileInputStream corgiFis = new FileInputStream("src/homework/lesson6/Corgi.txt");
            FileInputStream alpacaFis = new FileInputStream("src/homework/lesson6/Alpaca.txt");
            FileOutputStream wikiFos = new FileOutputStream("src/homework/lesson6/wiki.txt");
            byte[] contentCorgiFile = corgiFis.readAllBytes();
            wikiFos.write(contentCorgiFile);
            byte[] contentAlpacaFile = alpacaFis.readAllBytes();
            wikiFos.write(contentAlpacaFile);
            wikiFos.close();
            alpacaFis.close();
            corgiFis.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            System.err.println("IOException");
        }
    }

    /**
     * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
     */
    public static boolean wordSeeker(String word, String filePath) throws FileNotFoundException {

        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            String[] words = string.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Написать метод, проверяющий, есть ли указанное слово в папке
     */
    public static boolean wordSeekerInDirectory(String word, String filePath) throws FileNotFoundException {
        File directory = new File(filePath);
        if (!directory.isDirectory()) {
            return false;
        }

        File[] files = directory.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (wordSeeker(word, files[i].getPath())) {
                return true;
            }
        }

        return false;
    }
}
