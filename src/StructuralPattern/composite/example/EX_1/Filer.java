package StructuralPattern.composite.example.EX_1;

/**
 * 文件节点
 */
public class Filer {
    private String fileName;

    public Filer(String fileName) {
        this.fileName = fileName;
    }
    public void display(){
        System.out.println(fileName);
    }

    public String getFileName() {
        return fileName;
    }
}
