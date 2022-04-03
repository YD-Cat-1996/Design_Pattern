package StructuralPattern.composite.example.EX_2;

public abstract class AbstractNode {
    protected String nodeName;

    public AbstractNode(String nodeName) {
        this.nodeName = nodeName;
    }

    public void addNode(AbstractNode node) throws Exception {
        throw new Exception("文件节点无法创建目录节点");
    }

    public String getNodeName() {
        return nodeName;
    }

    abstract void display();
}
