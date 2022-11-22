package com.head.first.chap17.networking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P628RunThreads {

	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		threadPool.execute(() -> runJob("Job1"));
		threadPool.execute(() -> runJob("Job2"));
		threadPool.shutdown();
	}

	private static void runJob(String jobName) {
		for (int i = 0; i < 25; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(jobName + "is running on " + threadName);
		}
	}
}
