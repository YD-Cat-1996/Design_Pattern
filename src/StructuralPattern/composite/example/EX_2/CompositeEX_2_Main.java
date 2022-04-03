package StructuralPattern.composite.example.EX_2;

import java.io.File;

/**
 * 将文件节点和目录节点抽象出一个抽象节点
 */
public class CompositeEX_2_Main {
    public static void main(String[] args) throws Exception {
        AbstractNode noder= new Noder("G:\\share");
        createTree(noder);
        noder.display();
    }
    public static void createTree(AbstractNode node) throws Exception {
        File fileNode=new File(node.getNodeName());
        File[] files=fileNode.listFiles();
        for (File file : files) {
            if(file.isFile()) {
                AbstractNode filer = new Filer(file.getAbsolutePath());
                node.addNode(filer);
            } else if(file.isDirectory()){
                AbstractNode noder=new Noder(file.getAbsolutePath());
                node.addNode(noder);
                createTree(noder);
            }
        }
    }
}
