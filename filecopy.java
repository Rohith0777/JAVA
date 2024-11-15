import java.io.*;
class filecopy{
    public static void main(String[] args) throws IOException{
        FileInputStream f1="null";
        FileOutputStream f2="null";
        try{
        f1=new FileInputSteeam("test1.txt");
        f2=new FileOutputStream("cp.txt");
        int c;
        c=f1.read();
        do{
            if(c!=-1){
                f2.write((char)c);
                System.out.println((char)c);
            }
        while(c=-1){
            catch(FileNotFoundException e){
                System.out.println("File Not Found")
                return ;
            }
        }
        }
        f1.close();
        f2.close();
    }
}
