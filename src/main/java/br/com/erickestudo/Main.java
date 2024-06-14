package br.com.erickestudo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        var serverSocket = new ServerSocket();
        if (!serverSocket.isBound()) {
            serverSocket.bind(new InetSocketAddress("127.0.0.1", 4444));
        }

        System.out.println("escutando na porta 4444");

        while (true) {
            Socket socket = serverSocket.accept();

            Scanner scanner = new Scanner(socket.getInputStream());
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        }
    }
}