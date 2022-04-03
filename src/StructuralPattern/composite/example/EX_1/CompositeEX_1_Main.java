package StructuralPattern.composite.example.EX_1;

import java.io.File;

/**
 * 文件节点和目录节点分开
 */
public class CompositeEX_1_Main {
    public static void main(String[] args) {
        Noder noder=new Noder("G:\\share");
        createTree(noder);
        noder.display();
    }
    public static void createTree(Noder node){
        File fileNode=new File(node.getNodeName());
        File[] files=fileNode.listFiles();
        for (File file : files) {
            if(file.isFile()) {
                Filer filer = new Filer(file.getAbsolutePath());
                node.addFiler(filer);
            } else if(file.isDirectory()){
                Noder noder=new Noder(file.getAbsolutePath());
                node.addNoder(noder);
                createTree(noder);
            }
        }
    }
}
