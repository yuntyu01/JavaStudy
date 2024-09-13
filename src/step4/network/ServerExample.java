package step4.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.System.exit;

public class ServerExample {

    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        int port = 50001;
        ExecutorService executors = Executors.newFixedThreadPool(2);

        System.out.println("----------------------------");
        System.out.println("연결하고 싶은 port 번호 작성하세요");
        System.out.println("서버를 종료하려면 q또는 Q를 입력하고 Enter키를 입력하세요. ");
        System.out.println("----------------------------");


        startServer(executors, port);

        Scanner scanner = new Scanner(System.in);

        while(true){
            String key = scanner.nextLine();

            if (Integer.valueOf(key) != port) {
                System.out.println("없는 port 번호 입니다 다시 입력하십쇼.");
                continue;
            }

            if (key.toLowerCase().equals("q"))
                break;

            clientConnect(port);
        }

        scanner.close();

        stopServer(executors);
    }

    public static void clientConnect(int port){
        try{
            Socket socket = new Socket("localhost", port);

            System.out.println("[클라이언트] 연결 성공");
            socket.close();
            System.out.println("[클라이언트] 연결 끊음");
            exit(0);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void stopServer(ExecutorService executors) {
        try {
            serverSocket.close();
            System.out.println("[서버] 종료됨");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            executors.close();
        }
    }


    public static void startServer(ExecutorService executors, int port) {
        executors.execute(new ServerCallable(port));

    }

    public static class ServerCallable implements Runnable {
        private int port;

        public ServerCallable(int port) {
            this.port = port;
        }

        @Override
        public void run() {

            try {

                serverSocket = new ServerSocket(port);
                System.out.println("[서버] 시작 됨");

                while (true) {
                    System.out.println("\n[서버] 연결 요청을 기다림 \n");
                    Socket socket = serverSocket.accept();

                    InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                    System.out.println("[서버]" + isa.getHostName() + "의 연결 요청을 수락함");

                }
            } catch (IOException e) {
                System.out.println("[서버]" + e.getMessage());
            }


        }
    }
}
