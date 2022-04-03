package StructuralPattern.composite.example.EX_2;

/**
 * 文件节点
 */
public class Filer extends AbstractNode {

    public Filer(String fileName) {
        super(fileName);
    }
    public void display(){
        System.out.println(nodeName);
    }
}
