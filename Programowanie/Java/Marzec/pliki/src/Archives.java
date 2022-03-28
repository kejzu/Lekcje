import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Archives {
    public void pack(String archName, String fileList) throws IOException {
        FileOutputStream fos = new FileOutputStream(archName+".zip");
        ZipOutputStream zos = new ZipOutputStream(fos);
        if(fileList.contains(",")){
            String[] filesArray = fileList.split(",");
            List<String> files = Arrays.asList(filesArray);
            for(String srcFile : files){
                File toZip = new File(srcFile);
                FileInputStream fis = new FileInputStream(toZip);
                ZipEntry entry = new ZipEntry(toZip.getName());
                zos.putNextEntry(entry);

                byte bytes[] = new byte[1024];
                int lenght;
                while ((lenght = fis.read(bytes))>=0){
                    zos.write(bytes, 0, lenght);
                }
                fis.close();
            }
        }
    }
}
