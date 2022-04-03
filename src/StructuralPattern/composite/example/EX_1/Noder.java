package StructuralPattern.composite.example.EX_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录节点
 */
public class Noder {
    private String nodeName;

    public Noder(String nodeName) {
        this.nodeName = nodeName;
    }
    List<Noder> nodeList=new ArrayList<>();
    List<Filer> fileList=new ArrayList<>();

    public void addNoder(Noder noder){
        this.nodeList.add(noder);
    }
    public void addFiler(Filer filer){
        this.fileList.add(filer);
    }
    public void display(){
        for (Noder noder : this.nodeList) {
            System.out.println(noder.nodeName);
            noder.display();
        }
        for (Filer filer : this.fileList) {
            filer.display();
        }
    }

    public String getNodeName() {
        return nodeName;
    }
}
