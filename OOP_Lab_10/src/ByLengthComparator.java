import java.io.File;
import java.util.Comparator;


public class ByLengthComparator implements Comparator<File> {
    public int compare(File file1,File file2){
        if(file1.isDirectory() && !file2.isDirectory())
            return -1;
        else if(!file1.isDirectory() && file2.isDirectory())
            return 1;
        else
            return file1.getName().compareToIgnoreCase(file2.getName());
    }
    public void printFileNames(){

    }
}

