package StructuralPattern.composite.example.EX_2;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录节点
 */
public class Noder extends AbstractNode {
    List<AbstractNode> nodeList=new ArrayList<>();

    public Noder(String nodeName) {
        super(nodeName);
    }

    public void addNode(AbstractNode node) throws Exception {
        nodeList.add(node);
    }

    public void display(){
        System.out.println(nodeName);
        for(AbstractNode node:nodeList){
            node.display();
        }
    }
}
