package isfile.isdir;

import java.io.*;

public class IsFileIsDir {

    public static void main(String[] args) throws IOException, NullPointerException {
        File f = new File("H:\\Hasho/me.txt");
        PrintWriter p = new PrintWriter(System.out, true);
        f.createNewFile();
        p.println("Is File : " + f.isFile() + "\nIs Directory : " + f.isDirectory());
        BufferedWriter b = new BufferedWriter(new FileWriter("H:\\Hasho/me.txt"));
        String s = "Hasibuzzaman Khan";
        b.write(s); //b.close();
        File dir = new File("H:\\Hasho");
        System.out.println("Directory exists : " + dir.exists());
        String dris[] = null;
        dris = dir.list();
        System.out.println("Only File names : ");
        for (String a : dris) {

            File f1 = new File(dir, a);
            if (f1.isFile()) {
                System.out.println(a);
            }
            b.write(a);
        }
        b.close();
        System.out.println("Only Directory names : ");
        for (String s1 : dris) {
            File f2 = new File(dir, s1);
            if (f2.isDirectory()) {
                System.out.println(s1);
            }

        }
        System.out.println(f.length());

        //  f.delete();
    }
}
