package CreationalPattern.builder.example.interf;

public interface Item {
    String name();
    double price();
    // 打包
    Packing packing();
}
