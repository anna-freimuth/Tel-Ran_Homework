import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        printWriter();

        printStream();

    }



    public static void printWriter()throws IOException {

        FileOutputStream fos = new FileOutputStream("2021_02_01_print_writer/src/output.txt");

        PrintWriter pw = new PrintWriter(fos);

        // PrintWriter pw = new PrintWriter(new FileOutputStream("2021_02_01_print_writer/src/output.txt"));

        // PrintWriter pw_short = new PrintWriter("output.txt");



        pw.println("Hello");

        pw.println("Hello");



        //commit collected data (and used also for cleaning data itself in memory, works as StringBuffer), can be used many times

        pw.flush(); //opens connection with file



        pw.println("Hello");

        pw.println("Hello");

        pw.println("Hello2");



        //when writing close, pw.flush() no need to write for commit and we use close only once

        pw.close();  // after this string pw and fos do not work





        pw.println("000"); //does not throw

        //fos.write("0000".getBytes()); //throws

    }



    public static void printStream() throws IOException {  //works slow with a big amount of data (opens connection with file with every println)

        FileOutputStream fos = new FileOutputStream("2021_02_01_print_writer/src/output2.txt");

        PrintStream ps = new PrintStream(fos);

        ps.println("Hello");

        ps.println("Hello");

        ps.println("Hello");

        ps.println("Hello");

        ps.println("Hello2");



        ps.close();

    }

}
