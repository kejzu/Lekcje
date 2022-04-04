import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
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
            zos.close();
            fos.close();
        }
    }

    public void unpack(String archName, String outDir, String filesList) throws IOException{
        Path path = Paths.get(outDir);
        if(!Files.exists(path)){
            System.out.println("Docelowy katalog wypakowania nie istnieje");
            Files.createDirectory(path);
        }
        File dstDir = new File(outDir);
        byte buffer[] = new byte[1024];
        try {
            FileInputStream fis = new FileInputStream(archName+".zip");
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry entry = zis.getNextEntry();
            while (entry != null){
                File newFile = newFile(dstDir,entry);
                if (entry.isDirectory()){
                    if (!newFile.isDirectory() && !newFile.mkdirs()){
                        throw new IOException("Błąd w tworzeniu katalogu"+newFile);
                    }
                }else {

                }

                FileOutputStream fos = new FileOutputStream(newFile);
                int lenght;
                while ((lenght = zis.read(buffer))>0){
                    fos.write(buffer,0,lenght);
                }
                fos.close();
                entry = zis.getNextEntry();
            }
            zis.closeEntry();
            zis.close();
        }catch (Exception ex){
            System.out.println("Nieodnaleziono plik"+archName);
        }
    }

    private File newFile(File dstDir, ZipEntry entry) throws IOException{
        File destFile = new File(dstDir,entry.getName());
        String dstDirPath = dstDir.getCanonicalPath();
        String dstFilePath = destFile.getCanonicalPath();
        if (!dstFilePath.startsWith(dstDirPath+File.separator)){
            throw new IOException("Wpis jest poza docelowym katalogiem "+entry.getName());
        }
        return destFile;
    }
}
