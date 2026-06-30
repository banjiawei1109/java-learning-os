public class Variables {
    public static void main(String[] args) {
        // 1. 基本数据类型
        int score = 100;              // 整数
        double temperature = 36.5;     // 浮点数
        boolean passed = true;        // 布尔
        char grade = 'A';              // 字符
        
        // 2. 引用类型
        String message = "Java 21 学习";  // 字符串
        
        // 3. 类型推断（Java 10+）
        var count = 10;              // 自动推断为 int
        var title = "Hello";          // 自动推断为 String
        
        System.out.println("=== 变量练习 ===");
        System.out.println("分数：" + score);
        System.out.println("温度：" + temperature);
        System.out.println("是否通过：" + passed);
        System.out.println("等级：" + grade);
        System.out.println("消息：" + message);
        System.out.println("count 类型推断：" + count);
        System.out.println("title 类型推断：" + title);
        
        // 4. 常量（final）
        final int MAX_SIZE = 100;
        System.out.println("常量 MAX_SIZE：" + MAX_SIZE);
    }
}
