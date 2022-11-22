package com.head.first.chap17.networking;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class P605SimpleChatClientA {
	private JTextField outgoing;
	private PrintWriter writer;

	public void go() {
		setUpNetworking();

		outgoing = new JTextField(20);

		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(e -> sendMessage());

		JPanel mainPanel = new JPanel();
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);

		JFrame frame = new JFrame("Ludicrously Simple Chat Client");
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(400, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	private void setUpNetworking() {
		try {
			InetSocketAddress serverAddress = new InetSocketAddress("192.168.3.72", 5000);
			SocketChannel socketChannel = SocketChannel.open(serverAddress);
			writer = new PrintWriter(Channels.newWriter(socketChannel, UTF_8));
			System.out.println("Networking established. Client running at: " + socketChannel.getLocalAddress());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void sendMessage() {
		writer.println(outgoing.getText());
		writer.flush();
		outgoing.setText("");
		outgoing.requestFocus();
	}

	public static void main(String[] args) {
		new P605SimpleChatClientA().go();
	}
}
