import java.util.Scanner;

public class Device {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("请选择要执行的操作：");
            System.out.println("1. 注册证书");
            System.out.println("2. 启动");
            System.out.println("0. 关机");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    KeyClient.setDeviceName("电子门"); // 修改 KeyClient 设备名
                    KeyClient.main(null); // 启动 KeyClient
                    break;
                case 2:
                    TargetDevice.setDeviceName("电子门"); // 修改 TargetDevice 设备名
                    TargetDevice.main(null); // 启动 TargetDevice
                    break;
                case 0:
                    running = false; // 退出循环
                    System.out.println("关机");
                    break;
                default:
                    System.out.println("无效选择，请重试。");
                    break;
            }
        }

        scanner.close(); // 关闭扫描器
    }
}